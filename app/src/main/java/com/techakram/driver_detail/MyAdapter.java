package com.techakram.driver_detail;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.techakram.models.DriverDetail;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewholder>
{
    Context mcontext;
    private List<DriverDetail> driverDetails;

    public MyAdapter(Context c , List<DriverDetail> driverDetails) {
        this.mcontext=c;
        this.driverDetails = driverDetails;
    }



    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.card,viewGroup,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
//      String id=model.get(position).getId();
//      String masterId=model.get(position).getMaster_driver_id();
//      String subdid=model.get(position).getSub_driver_id();
//      String shipping=model.get(position).getShipping_type();
//      String vehicletype=model.get(position).getVehicle_type();
//      String typeofvehicle=model.get(position).getType_of_vehicle();
//      String vehiclergno=model.get(position).getVehicle_reg_no();
//      String userid=model.get(position).getUser_id();
//      String fname=model.get(position).getFname();
//      String lname=model.get(position).getLname();
//      String email=model.get(position).getEmail();
//      String mobile=model.get(position).getMobile();
//      String loginstatus =model.get(position).getLogin_status();
//      String latitude=model.get(position).getLatitude();
//      String longitude=model.get(position).getLongitude();
//      holder.setData(id,masterId,subdid,shipping,vehicletype,typeofvehicle,vehiclergno,
//              userid,fname,lname,email,mobile,loginstatus,latitude,longitude);
      holder.textView1.setText(driverDetails.get(position).getId());
      holder.textView2.setText(driverDetails.get(position).getMasterDriverId());
      holder.textView3.setText(driverDetails.get(position).getSubDriverId());
      holder.textView4.setText(driverDetails.get(position).getShippingType());
      holder.textView5.setText(driverDetails.get(position).getVehicleType());
      holder.textView6.setText(driverDetails.get(position).getTypeOfVehicle());
      holder.textView7.setText(driverDetails.get(position).getVehicleRegNo());
      holder.textView8.setText(driverDetails.get(position).getUserId());
      holder.textView9.setText(driverDetails.get(position).getFname());
      holder.textView10.setText(driverDetails.get(position).getLname());
      holder.textView11.setText(driverDetails.get(position).getEmail());
      holder.textView12.setText(driverDetails.get(position).getMobile());
      holder.textView13.setText(driverDetails.get(position).getLoginStatus());
      holder.textView14.setText(driverDetails.get(position).getLatitude());
      holder.textView15.setText(driverDetails.get(position).getLongitude());
    }

    @Override
    public int getItemCount()
    {
        return driverDetails.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView textView1,textView2,textView3,textView4,textView5,textView6,
                textView7,textView8,textView9,textView10,textView11,textView12,
                textView13,textView14,textView15;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            textView1= itemView.findViewById(R.id.tVId);
            textView2= itemView.findViewById(R.id.tVMstDId);
            textView3= itemView.findViewById(R.id.tVSDId);
            textView4= itemView.findViewById(R.id.tVShType);
            textView5= itemView.findViewById(R.id.tVVType);
            textView6= itemView.findViewById(R.id.tVTOVehicle);
            textView7= itemView.findViewById(R.id.tVVRegNo);
            textView8= itemView.findViewById(R.id.tVUId);
            textView9= itemView.findViewById(R.id.tVFname);
            textView10= itemView.findViewById(R.id.tVLname);
            textView11= itemView.findViewById(R.id.tVEmail);
            textView12= itemView.findViewById(R.id.tVMobile);
            textView13= itemView.findViewById(R.id.tVLgS);
            textView14= itemView.findViewById(R.id.tVLatitude);
            textView15= itemView.findViewById(R.id.tVLongitude);
        }

    }

}

