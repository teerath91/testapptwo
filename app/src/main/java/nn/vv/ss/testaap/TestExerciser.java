package nn.vv.ss.testaap;


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class TestExerciser implements Exerciser {

    int position;
    View convertView;
    ViewGroup parent;
    Activity activity;


    TestExerciser (Activity activity, ViewGroup parent) {
        this.activity = activity;
        this.parent = parent;
        this.convertView = LayoutInflater.from(activity).inflate(R.layout.your_layout, null);
    }


    @Override
    public void exercise() {

        //ViewHolderSample viewholder = new ViewHolderSample();
        ViewHolderSample.Adapter3 holder = new ViewHolderSample.Adapter3(activity);
        holder.getView(position, convertView, parent);
        //View gView1 = viewholder.getView(position, convertView, parent);
        //viewholder.getView(position, convertView, parent);
        //lapTimesView.setAdapter(viewholder);
        //lapTimesView.setAdapter(lapTimesAdapter);
    }
}