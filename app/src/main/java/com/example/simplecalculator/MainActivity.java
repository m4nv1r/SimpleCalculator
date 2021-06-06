package com.example.simplecalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    Button btnAdd, btnFind, btnDelete;
    EditText inputSave;
    String mText;

    private static final String TAG = "MainActivity";
    TextView display;
    String equation = new String("");
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        btnFind = findViewById(R.id.btnFind);
        btnDelete = findViewById(R.id.btnDelete);
        inputSave = findViewById(R.id.inputVal);
        display = findViewById(R.id.displayScreen);
        db = FirebaseFirestore.getInstance();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText = inputSave.getText().toString().trim();
                if (mText.isEmpty()) {//user hasnt enter
                    Toast.makeText(MainActivity.this, "Please enter name", Toast.LENGTH_SHORT).show();
                } else {//user has entered string data
                    display.setText(mText);
                }
            }
        });

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> data = new HashMap<>();
                data.put("Name", mText);
                data.put("NameE", "HI");

                db.collection("users")
                        .document("bob").set(data);

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText = inputSave.getText().toString().trim();
                saveToFireBase(mText);

            }
        });

    }

    public void saveToFireBase(String input){
        HashMap<String, Object> data = new HashMap<>();
        data.put("Name", mText);
        data.put("NameE", "HI");

        db.collection("users")
                .add(data)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });

    }

}