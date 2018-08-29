package com.example.choi.listviewtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter extends BaseAdapter {

    private final List<Weather> data;
    private Map<String, Integer> ImageMap;

    public MyAdapter(List data) {
        this.data = data;

        ImageMap = new HashMap();
        ImageMap.put("맑음", R.drawable.sunny);
        ImageMap.put("폭설",R.drawable.blizzard);
        ImageMap.put("구름", R.drawable.cloudy);
        ImageMap.put("비", R.drawable.rainy);
        ImageMap.put("눈", R.drawable.snow);
    }

    @Override
    public int getCount() {
        return data.size();
    }


    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    // 각 아이템이 별개라고 할 때 아이템이 화면에 보일 때 호출되는 메서드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.image_icon);
            TextView cityText = (TextView)convertView.findViewById(R.id.city_text);
            TextView tempText = (TextView)convertView.findViewById(R.id.temp_text);

            viewHolder.cityText = cityText;
            viewHolder.tempText = tempText;
            viewHolder.imageView = imageView;

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Weather weather = data.get(position);

        viewHolder.cityText.setText(weather.getCity());
        viewHolder.tempText.setText(weather.getTemp());
        viewHolder.imageView.setImageResource(ImageMap.get(weather.getWeather()));

        return convertView;
    }


    static class ViewHolder {
        ImageView imageView;
        TextView cityText;
        TextView tempText;
    }


}
