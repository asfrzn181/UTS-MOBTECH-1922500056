package ac.id.atmaluhur.mhs.muhamadasfarezhan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText absensi;
    EditText tugas;
    EditText uts;
    EditText uas;
    TextView hasil;
    TextView grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        absensi = (EditText) findViewById(R.id.txtAbsensi);
        tugas = (EditText) findViewById(R.id.txtTugas);
        uts = (EditText) findViewById(R.id.txtUTS);
        uas = (EditText) findViewById(R.id.txtUAS);
        hasil = (TextView) findViewById(R.id.valueAkhir);
        grade = (TextView) findViewById(R.id.valueGrade);
    }

    public void hitung(View View){
        String[] grd = {"A","B","C","D","E"};
        Double[] pers = {0.1,0.2,0.3,0.4};
        Double abs = Double.parseDouble(absensi.getText().toString());
        Double tgs = Double.parseDouble(tugas.getText().toString());
        Double mid = Double.parseDouble(uts.getText().toString());
        Double us = Double.parseDouble(uas.getText().toString());
        Double calculation= (abs * pers[0]) + (tgs * pers[1]) + (mid * pers[2]) + (us * pers[3]);
        hasil.setText(calculation.toString());
        if (calculation >= 81 && calculation <= 100){
            grade.setText(grd[0]);
        }else if (calculation < 81 && calculation >= 71){
            grade.setText(grd[1]);
        }else if (calculation < 71 && calculation >= 61){
            grade.setText(grd[2]);
        }else if(calculation < 61 && calculation >= 51){
            grade.setText(grd[3]);
        }else if(calculation < 51){
            grade.setText(grd[4]);
        }else{
            grade.setText("TIDAK DAPAT LEBIH DARI 100 /n ATAU KURANG DARI 0");
        }
    }
}