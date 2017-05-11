package com.k2infosoft.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.k2infosoft.model.DocumentDetail;
import com.k2infosoft.recyclerview_okhttp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    public static ArrayList<DocumentDetail> dataAdapterArrayList;
    private Context context;

    public static final String TAG = "DataAdapter";

    public DataAdapter(ArrayList<DocumentDetail> dataAdapterArrayList, Context c) {
        this.dataAdapterArrayList = dataAdapterArrayList;
        this.context = c;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.personaldetails, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_name.setText(dataAdapterArrayList.get(i).getFirstName() + " " + dataAdapterArrayList.get(i).getLastName());
        viewHolder.tv_email.setText(dataAdapterArrayList.get(i).getEmail());
        Picasso.with(context).load(dataAdapterArrayList.get(i).getProfilepic()).into(viewHolder.thumbnail);

        Log.d(TAG, "onBindViewHolder: " + dataAdapterArrayList.get(i).getProfilepic());
        //viewHolder.tv_api_level.setText(android.get(i).getApi());
    }

    @Override
    public int getItemCount() {
        return dataAdapterArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_email, tv_api_level;
        CircleImageView thumbnail;

        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_email = (TextView) view.findViewById(R.id.tv_mobile);
            thumbnail = (CircleImageView) view.findViewById(R.id.profile_image);

        }
    }

    public void removeItem(int position) {
        dataAdapterArrayList.remove(position);
        notifyItemRemoved(position);
    }

    public void setFilter(List<DocumentDetail> contactsModels) {
        dataAdapterArrayList = new ArrayList<>();
        dataAdapterArrayList.addAll(contactsModels);
        notifyDataSetChanged();
    }

    public interface ClickListener {
        void onClick(View view, int position);

        void onLongClick(View view, int position);
    }


}

