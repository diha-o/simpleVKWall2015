package pc.dd.tabhost;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.vk.sdk.VKScope;

/**
 * Created by User on 02.06.2016.
 */
public class oneFragmen extends Fragment {

    public String wall_text = "";

    private static String[] vkScope = new String[]{VKScope.WALL};

    public TextView cardView_wallText;

    public TextView like_text;

    public TextView comment_text;

    public AnimatorSet set = null;
    private  View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.cardwiev_posts,null);

        cardView_wallText = (TextView) v.findViewById(R.id.cardView_text); // get view from cardboard
        like_text = (TextView)v.findViewById(R.id.textView2);
        comment_text = (TextView)v.findViewById(R.id.textView3);///end of OnCreate
        return v;
    }
    public void makeView(String[] wallPhoto, String wallText, Context context , String _like_text, String _comment_text, int kof_mass) {
        cardView_wallText.setText(wallText);
        like_text.setText(_like_text);
        comment_text.setText(_comment_text);

        ImageView[] cardView_image = new ImageView[16];
        int[] id = new int[]{R.id.imageView2, R.id.imageView3, R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7, R.id.imageView8, R.id.imageView9, R.id.imageView10, R.id.imageView11};

        for (int i = 0; i < kof_mass; i++) {
            cardView_image[i] = (ImageView) v.findViewById(id[i]);
            Picasso.with(context).load(wallPhoto[i])
                    // .resize(200,200)
                    .into(cardView_image[i]);
        }

        Log.d("=============== ", wall_text);
    }

}
