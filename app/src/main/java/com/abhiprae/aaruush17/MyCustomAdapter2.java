package com.abhiprae.aaruush17;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by Abhiprae on 7/23/2017.
 */

public class MyCustomAdapter2 extends BaseExpandableListAdapter {

    Context context = null;
    int rank[];
    String name[];
    double balance[];

    public MyCustomAdapter2(Context context, int rank[], String name[], double balance[]) {
        this.context = context;
        this.rank = rank;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public int getGroupCount() {
        return name.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public String getGroup(int groupPosition) {
        return name[groupPosition];
    }

    @Override
    public String getChild(int groupPosition, int childPosition) {
        return "" + balance[childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.rank_list, parent, false);
        }
        TextView ranks = (TextView) convertView.findViewById(R.id.rank);
        ranks.setText("" + rank[groupPosition]);
        TextView title = (TextView) convertView.findViewById(R.id.name);
        title.setText(name[groupPosition]);
        TextView total = (TextView) convertView.findViewById(R.id.total);
        total.setText("" + balance[groupPosition]);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        /*TextView message = (TextView)convertView.findViewById(R.id.message);
        message.setText(balance[groupPosition]);*/
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
