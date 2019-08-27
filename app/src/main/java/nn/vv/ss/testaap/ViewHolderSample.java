package nn.vv.ss.testaap;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public abstract class ViewHolderSample extends BaseAdapter {

/*    Context context;
    public ViewHolderSample(Context context) {
        this.context = context;
    }*/

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    Context context;

    public static class Adapter3 extends ViewHolderSample {
        public Adapter3(Context context) {
            this.context = context;
        }

        static class ViewHolderItem {
            TextView text;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolderItem viewHolderItem;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.your_layout, null);
                viewHolderItem = new ViewHolderItem();
                viewHolderItem.text = (TextView) convertView.findViewById(R.id.text);
                convertView.setTag(viewHolderItem);
            } else {
                viewHolderItem = (ViewHolderItem) convertView.getTag();
            }
            View v = convertView;
            TextView text = viewHolderItem.text;
            text.setText("Position " + position);

            return v;
        }
    }
}



/*    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.your_layout, null);

        TextView text = (TextView) convertView.findViewById(R.id.text);
        text.setText("Position " + position);

        return convertView;
    }*/

