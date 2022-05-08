package com.dikasihnama.jejama.kuesioner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.dikasihnama.jejama.MainActivity;
import com.dikasihnama.jejama.R;
import com.dikasihnama.jejama.home.nonpasien.NonpasienFragment;
import com.dikasihnama.jejama.home.penderita.PenderitaFragment;

public class KuesionerActivity extends AppCompatActivity {

    TextView btnNext, btnPrev, txQuest;
    RadioGroup rg;
    RadioButton rbYes, rbNo;
    int currentQuestionIndex = 0;
    static int result, yes, no;
    FragmentManager manager;

    String[] question = new String[]{
            "Apakah sebelumnya anda tahu tentang Thalasemia?",
            "Apakah sebelumnya anda pernah melakukan transfusi darah?",
            "Diagnosis dini Thalasemia. Jawab pertanyaan berikut\nCepat merasa lemas dan lelah ketika beraktifitas serta mudah mengantuk",
            "Diagnosis dini Thalasemia. Jawab pertanyaan berikut\nSering mengalami sakit kepala atau pusing",
            "Diagnosis dini Thalasemia. Jawab pertanyaan berikut\nKulit terlihat pucat atau kekuningan",
            "Diagnosis dini Thalasemia. Jawab pertanyaan berikut\nPerut membuncit (akibat pembesaran organ limpa, yang berupaya memproduksi sel darah merah lebih banyak akibat kondisi anemia)"
    };

    String[] answer = new String[]{
            "Tidak", "Ya",
            "Tidak Pernah", "Pernah",
            "Tidak", "Ya",
            "Tidak", "Ya",
            "Tidak", "Ya",
            "Tidak", "Ya"
    };

    String[] trueAnswer = new String[]{
            "Ya",
            "Pernah",
            "Ya",
            "Ya",
            "Ya"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuesioner);

        rbYes = findViewById(R.id.btnYes);
        rbNo = findViewById(R.id.btnNo);
        btnNext = findViewById(R.id.next);
        btnNext.setOnClickListener(v -> startActivity(new Intent(KuesionerActivity.this, MainActivity.class)));
        btnPrev = findViewById(R.id.prev);

        txQuest = findViewById(R.id.question);

        txQuest.setText(question[currentQuestionIndex]);
        rbNo.setText(answer[0]);
        rbYes.setText(answer[1]);

        rg.check(0);

        yes = 0;
        no = 0;
    }

    public void next(View view){
        if (rbYes.isChecked() || rbNo.isChecked()){
            RadioButton answerUser = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String getAnswerUser = answerUser.getText().toString();
            rg.check(0);

            if(getAnswerUser.equalsIgnoreCase(trueAnswer[currentQuestionIndex])) yes++;
            else no++;
            currentQuestionIndex++;

            if (currentQuestionIndex < question.length) {
                txQuest.setText(question[currentQuestionIndex]);
                rbNo.setText(answer[(currentQuestionIndex * 2)]);
                rbYes.setText(answer[(currentQuestionIndex * 2) + 1]);
            } else {
                result = yes + 2;
                if (result <= 8){
                    Intent intent = new Intent(KuesionerActivity.this, MainActivity.class);
                    intent.putExtra("EXTRA","nonpasien");
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(KuesionerActivity.this, MainActivity.class);
                    intent.putExtra("EXTRA","penderita");
                    startActivity(intent);
                }
            }
        }
    }
}