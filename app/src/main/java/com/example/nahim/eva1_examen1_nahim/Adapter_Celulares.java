package com.example.nahim.eva1_examen1_nahim;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Nahim on 19/02/2018.
 */

public class Adapter_Celulares extends ArrayAdapter {
    private Activity context;
    ArrayList<Celulares> celular;
    private int resource;

    public Adapter_Celulares(@NonNull Activity context, @LayoutRes int resource, ArrayList<Celulares> celular){
        super(context, resource, celular);
        this.context=context;
        this.celular=celular;
        this.resource=resource;
    }
    @Override
    public int getCount() {
        return celular.size();
    }

    @Override
    public Object getItem(int position) {
        return celular.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            if (context != null){
                convertView = context.getLayoutInflater().inflate(resource,null);
                holder.txtItem = (TextView) convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Celulares celulares = celular.get(position);
        holder.txtItem.setText(celulares.getModelo());
        holder.txtItem.setBackgroundColor(Color.BLUE);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            if (context != null){
                convertView = context.getLayoutInflater().inflate(resource,null);
                holder.txtItem = (TextView) convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Celulares celulares = celular.get(position);
        holder.txtItem.setText(celulares.getModelo());
        holder.txtItem.setBackgroundColor(Color.BLUE);
        return convertView;
    }

    static class ViewHolder{
        private TextView txtItem;
    }
}
