package com.ashishramkissoon.accountcareer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListview extends ArrayAdapter<String> {

    private String[] fruitname;
    private String[] desc;
    private String[] view;

    private Integer[] imgid;
    private Activity context;

    public CustomListview(Activity context, String[] fruitname, String[] desc,String[] view, Integer[] imgid) {
        super(context, R.layout.listview_layout,fruitname);

        this.context=context;
        this.fruitname=fruitname;
        this.desc=desc;
        this.view=view;
        this.imgid=imgid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r= convertView;
         ViewHolder viewHolder=null;

         if(r==null){
             LayoutInflater layoutInflater=context.getLayoutInflater();
             r=layoutInflater.inflate(R.layout.listview_layout,null,true);
             viewHolder=new ViewHolder(r);
             r.setTag(viewHolder);

         }else{

             viewHolder=(ViewHolder) r.getTag();
         }

         viewHolder.ivw.setImageResource(imgid[position]);

            viewHolder.tvw1.setText(fruitname[position]);
            viewHolder.tvw2.setText(desc[position]);
        viewHolder.tvw3.setText(view[position]);

        return r;
    }

    class ViewHolder{
        TextView tvw1;
        TextView tvw2;
        TextView tvw3;

        ImageView ivw;

        ViewHolder(View v){
            tvw1=(TextView) v.findViewById(R.id.tvfruitname);
            tvw2=(TextView) v.findViewById(R.id.tvdescription);
            tvw3=(TextView) v.findViewById(R.id.tvview);

            ivw=(ImageView) v.findViewById(R.id.imageView);
        }
    }
}
