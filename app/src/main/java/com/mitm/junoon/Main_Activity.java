package com.mitm.junoon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mitm.junoon.Extra.AdapterRecyclerLinear;
import com.mitm.junoon.Extra.PojoLinear;

import java.util.ArrayList;
//custom_list
//main_recycler_linear
//PojoLinear
//AdapterRecyclerLineaar
public class Main_Activity extends AppCompatActivity {

 RecyclerView recyclerView;
 RecyclerView.LayoutManager layoutManager;

 AdapterRecyclerLinear adapterRecyclerLinear;

ArrayList<PojoLinear> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_recycler_linear);


        linearList();

        	 recyclerView = findViewById(R.id.recyclerview_linear);
        	 recyclerView.setHasFixedSize(true);
        	 layoutManager = new LinearLayoutManager(this);
        	 recyclerView.setLayoutManager(layoutManager);

        	 adapterRecyclerLinear = new AdapterRecyclerLinear(this,list);
        	 recyclerView.setAdapter(adapterRecyclerLinear);
        	 }
        	private void linearList(){

         list = new ArrayList<PojoLinear>();
         list.add(new PojoLinear("Pie","9.0"));
         list.add(new PojoLinear("Oreo","8.0"));
         list.add(new PojoLinear("Nougat","7.0"));
         list.add(new PojoLinear("Marshmallow","6.0"));
         list.add(new PojoLinear("Lolipop","5.0"));
         list.add(new PojoLinear("Kitkat","4.4"));
         list.add(new PojoLinear("Jelly Bean","4.1"));
         list.add(new PojoLinear("Icecream sandwitch","4.0"));
         list.add(new PojoLinear("Honey Comb","3.0 , 3.1 and 3.2"));
         list.add(new PojoLinear("Gingerbreak","2.3 , 2.4"));
         list.add(new PojoLinear("Froyo","2.2"));
       	 list.add(new PojoLinear("Eclair","2.0 , 2.1"));
       	 list.add(new PojoLinear("Donut","1.6"));
         list.add(new PojoLinear("Cupcake","1.5"));
         list.add(new PojoLinear("Unnamed and petit four","1.0 , 1.1"));
        	 }
	}
