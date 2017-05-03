package com.dentgeek.dentgeek.view.fragment;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dentgeek.dentgeek.R;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.graphics.Bitmap;
import android.content.Context;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class SearchFragment extends Fragment {

 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 GridView gridView = (GridView) container.findViewById(R.id.search);
 return gridView;

   }

}