package xyz.phyoekhant.padc2_week1_implicit_intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this, this);
    }

    @OnClick(R.id.btn_share)
    public void onShare(View view){
        Toast.makeText(MyApp.getContext(), "Share", Toast.LENGTH_SHORT).show();

        super.sendViaShareIntent(MyConstants.SHARE_INFO_STR);
    }

    @OnClick(R.id.btn_map)
    public void onNavigateMap(View view){
        Toast.makeText(MyApp.getContext(), "Map", Toast.LENGTH_SHORT).show();

        super.navigateInMap(MyConstants.URI_TO_OPEN_IN_MAP);

    }

    @OnClick(R.id.btn_phonecall)
    public void onMakePhoneCall(View view){
        Toast.makeText(MyApp.getContext(), "Phone Call", Toast.LENGTH_SHORT).show();

        super.makeCall(MyConstants.NUMBER_TO_CALL);
    }

    @OnClick(R.id.btn_email)
    public void onSendEmail(View view){
        Toast.makeText(MyApp.getContext(), "Email", Toast.LENGTH_SHORT).show();

        String toAddress = MyConstants.EMAIL1;
        String ccAddress = MyConstants.EMAIL2;
        String subject = MyConstants.MAIL_SUB;
        String bodyText = MyConstants.MAIL_BODY;

        super.composeEmail(toAddress, ccAddress, subject, bodyText);
    }

    @OnClick(R.id.btn_taking_pic)
    public void onTakingPicture(View view){
        Toast.makeText(MyApp.getContext(), "Take Pic", Toast.LENGTH_SHORT).show();

        super.capturePhoto();
    }

    @OnClick(R.id.btn_choose_pic)
    public void onChoosePicture(View view){
        Toast.makeText(MyApp.getContext(), "Choose Pic", Toast.LENGTH_SHORT).show();

        super.selectImage();
    }
}
