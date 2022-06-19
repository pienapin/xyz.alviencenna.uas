package xyz.alviencenna.uas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fragmentContact extends Fragment {

    private TextView ig, tw;
    private EditText name, subj, message;
    private Button submit;

    public fragmentContact() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ig = getView().findViewById(R.id.tv_instagram);
        tw = getView().findViewById(R.id.tv_twitter);
        name = getView().findViewById(R.id.cnt_name);
        subj = getView().findViewById(R.id.cnt_subject);
        message = getView().findViewById(R.id.cnt_message);
        submit = getView().findViewById(R.id.cnt_btn);

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/pie._n"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/oneplusnineteen"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cnt = new Intent(Intent.ACTION_SENDTO);
                cnt.putExtra(Intent.EXTRA_SUBJECT, subj.getText().toString());
                cnt.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
                cnt.setData(Uri.parse("mailto:pincenna@gmail.com"));
                cnt.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(cnt);
            }
        });

    }
}