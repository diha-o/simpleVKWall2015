package pc.dd.tabhost;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.fivehundredpx.greedolayout.GreedoLayoutManager;
import com.fivehundredpx.greedolayout.GreedoSpacingItemDecoration;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKAccessTokenTracker;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;
import com.vk.sdk.util.VKUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MainActivity extends AppCompatActivity {

    public String[] wall_photo = new String[16];

    public String wall_text = "";

    public int kof_mass = 0;

    private static String vkTokenKey = "k7GMwQhWs7yGlw2jKOer";

    public boolean _VKLogin = false;

    private static String[] vkScope = new String[]{VKScope.WALL};

    public TextView cardView_wallText;

    public TextView like_text;

    public String _like_text = "";

    public TextView comment_text;

    public String _comment_text = "";

    public AnimatorSet set = null;

    public FragmentManager manager;
    public FragmentTransaction transition;
    public oneFragmen fragmentF;


    VKAccessTokenTracker vkAccessTokenTracker = new VKAccessTokenTracker() {
        @Override
        public void onVKAccessTokenChanged(VKAccessToken oldToken, VKAccessToken newToken) {
            if (newToken == null) {
                Toast.makeText(getApplicationContext(), "Token Fail", Toast.LENGTH_LONG).show();
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_v2);
        //login vk
        VKSdk.login(this, vkScope);
        //  VKSdk.
        //recivle view

        manager = getSupportFragmentManager();
        fragmentF = new oneFragmen();
        transition = manager.beginTransaction();
        transition.add(R.id.container, fragmentF);
        transition.commit();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                _VKLogin = true;

                Toast.makeText(getApplicationContext(), "Login succes ", Toast.LENGTH_LONG).show();
                VKRequestResponse _response = new VKRequestResponse();
                _response.execute(res);
            }

            @Override
            public void onError(VKError error) {
                _VKLogin = false;

                Toast.makeText(getApplicationContext(), "Login Error", Toast.LENGTH_LONG).show();
            }

        }))
            super.onActivityResult(requestCode, resultCode, data);
    }

    class VKRequestResponse extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] params1) {
            VKParameters _params = new VKParameters();
            _params.put(VKApiConst.COUNT, "1");
            VKRequest _vkRequest = VKApi.wall().get(_params);
            _vkRequest.executeWithListener(new VKRequest.VKRequestListener() {
                @Override
                public void onComplete(VKResponse response) {
                    parsingFromJson(response.responseString);
                    fragmentF.makeView(wall_photo, wall_text, MainActivity.this, _like_text, _comment_text, kof_mass);
                    // Toast.makeText(getApplicationContext(),"Otvet "+response.responseString,Toast.LENGTH_LONG).show();
                    super.onComplete(response);
                }

                @Override
                public void onError(VKError error) {
                    Toast.makeText(getApplicationContext(), "Ошибка " + error, Toast.LENGTH_LONG).show();
                    super.onError(error);
                }

            });

            return null;
        }
    }

    private void parsingFromJson(String response) {
        Gson g = new Gson();
        Wall wall = new Wall();

        Wall.ResponseBean.ItemsBean.AttachmentsBean attachmentsBean = new Wall.ResponseBean.ItemsBean.AttachmentsBean();
        wall = g.fromJson(response, Wall.class);
        wall_text = wall.getResponse().getItems().get(0).getText().toString();
        _like_text = String.valueOf(wall.getResponse().getItems().get(0).getLikes().getCount());
        _comment_text = String.valueOf(wall.getResponse().getItems().get(0).getComments().getCount());

        try {
            for (kof_mass = 0; kof_mass < 16; kof_mass++) {
                attachmentsBean = wall.getResponse().getItems().get(0).getAttachments().get(kof_mass);
                wall_photo[kof_mass] = attachmentsBean.getPhoto().getPhoto_604().toString();
            }
        } catch (Exception e) {
        }
        ;


    }


}




