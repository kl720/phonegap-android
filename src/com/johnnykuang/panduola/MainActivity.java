package com.johnnykuang.panduola;



import java.util.Random;

import com.johnny.view.DragLayout;
import com.johnny.view.DragLayout.DragListener;
import com.nineoldandroids.view.ViewHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity{
	
	private DragLayout dl;
	private ListView lv;
	private TextView tv_noimg;
	private ImageView iv_icon, iv_bottom;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initDragLayout();
		initView();
	}
	
	public void registerKey()
	{
		System.out.print("5");
	}
	
	private void initView(){
		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,
				R.layout.item_text, new String[] { "NewBee", "ViCi Gaming",
						"Evil Geniuses", "Team DK", "Invictus Gaming", "LGD",
						"Natus Vincere", "Team Empire", "Alliance", "Cloud9",
						"Titan", "Mousesports", "Fnatic", "Team Liquid",
						"MVP Phoenix", "NewBee", "ViCi Gaming",
						"Evil Geniuses", "Team DK", "Invictus Gaming", "LGD",
						"Natus Vincere", "Team Empire", "Alliance", "Cloud9",
						"Titan", "Mousesports", "Fnatic", "Team Liquid",
						"MVP Phoenix" }));
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				
			}
		});
	}
	private void initDragLayout() {
		dl = (DragLayout) findViewById(R.id.dl);
		dl.setDragListener(new DragListener() {
			@Override
			public void onOpen() {
				//lv.smoothScrollToPosition(new Random().nextInt(30));
			}

			@Override
			public void onClose() {
				shake();
			}

			@Override
			public void onDrag(float percent) {
				//ViewHelper.setAlpha(iv_icon, 1 - percent);
			}
		});
	}
	
	private void shake(){
		
	}
}
