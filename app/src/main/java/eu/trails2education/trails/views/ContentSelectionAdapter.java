package eu.trails2education.trails.views;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import eu.trails2education.trails.R;
import eu.trails2education.trails.network.RequestManager;
import eu.trails2education.trails.path.Content;
import eu.trails2education.trails.path.Path;
import eu.trails2education.trails.path.PathUtils;

/**
 * Created by Ziga on 02-Dec-17.
 */

public class ContentSelectionAdapter extends RecyclerView.Adapter<ContentSelectionAdapter.MyViewHolder> {

    private List<Content> contentList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            // Fill in any views
            //title = (TextView) view.findViewById(R.id.title);
        }
    }
    public ContentSelectionAdapter() {
        ArrayList list = new ArrayList<Content>();
        list.add(new Content());list.add(new Content());list.add(new Content());
        this.contentList = list;
    }

    public ContentSelectionAdapter(List<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_option, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        /*Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());*/
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }
}