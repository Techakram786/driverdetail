package com.techakram.driver_detail;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.leo.simplearcloader.SimpleArcLoader;
import com.techakram.constants.Constants;
import com.techakram.models.DriverDetailsResponseModel;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Details extends Fragment {
    //SimpleArcLoader simpleArcLoader;
    //ScrollView scrollStats;
    Button btn1;
    String setUrl;
    MyAdapter myAdapter;
    List<Model> modelList;

    RequestQueue requestQueue;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_details, container, false);
        initview(view);
        recycler();

        btn1.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                showData();
            }
        });
        //showdata();
        return view;
    }

    private void initview(View view)
    {
        recyclerView=view.findViewById(R.id.recycler);
        btn1=view.findViewById(R.id.Show_button);
        requestQueue= Volley.newRequestQueue(getActivity());
    }
    private void recycler()
    {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void showData()
    {
        final ProgressDialog pd = new ProgressDialog(getActivity());
        pd.setMessage("please wait..");
        pd.show();

        StringRequest myRequest = new StringRequest(Request.Method.POST, Constants.BaseUrl+"getAllDriverCompletedOrdersnew", new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {

                pd.dismiss();

                Gson gson = new Gson();
                DriverDetailsResponseModel responseModel= gson.fromJson(response,DriverDetailsResponseModel.class);
                System.out.println("reeeess "+responseModel.getData().getDriverDetails().size() +"  "+responseModel.getData().getDriverDetails().get(0).getEmail() );

                    MyAdapter mAdapter=new MyAdapter(getActivity(),responseModel.getData().getDriverDetails());
                    recyclerView.setAdapter(mAdapter);

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pd.dismiss();
            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> mymap=new HashMap<String, String>();
                mymap.put("code","COURIERAPP-30062016");
                mymap.put("master_driver_id","45");
                mymap.put("sub_driver_id","41");
                mymap.put("type","0");
                mymap.put("start_date","jan 25,2021");
                mymap.put("end_date","jan 02,2021");
                return mymap;
            }
        };

        requestQueue.add(myRequest);
    }

}



