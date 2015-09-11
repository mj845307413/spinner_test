package adapter;

import info.Person;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android_test.R;

public class MyAdapter extends BaseAdapter{

	private List<Person> mlist;
	private Context mcontext;
	public MyAdapter(Context context,List<Person> list) {
		// TODO Auto-generated constructor stub
		this.mlist=list;
		this.mcontext=context;
		}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view=View.inflate(mcontext,R.layout.item, null);
		
		TextView textView=(TextView) view.findViewById(R.id.textView1);
		TextView textView2=(TextView) view.findViewById(R.id.textView2);
		textView.setText(mlist.get(position).getName());
		textView2.setText(mlist.get(position).getAge());
		return view;
//		LayoutInflater _LayoutInflater = LayoutInflater.from(mcontext);
//		convertView = _LayoutInflater.inflate(R.layout.item, null);
//		if (convertView != null) {
//			TextView _TextView1 = (TextView) convertView
//					.findViewById(R.id.textView1);
//			TextView _TextView2 = (TextView) convertView
//					.findViewById(R.id.textView2);
//			_TextView1.setText(mlist.get(position).getName());
//			_TextView2.setText(mlist.get(position).getAge());
//		}
//		return convertView;
	}

}
