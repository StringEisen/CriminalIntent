package com.bignerdranch.android.criminalintent;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by lenovo on 2015/9/25.
 */
public class PickerChoiceFragment extends DialogFragment{

    public static final String EXTRA_PICKER_CHOICE =
            "com.bignerdranch.android.criminalintent.picker_choice";

    private String choice;

    private void sendChoice(int resultCode) {
        Intent i = new Intent();
        i.putExtra(EXTRA_PICKER_CHOICE,choice);

        getTargetFragment().onActivityResult(getTargetRequestCode(),resultCode,i);
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.time_picker_title)
                .setPositiveButton(R.string.option_date_picker, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        choice="date";
                        sendChoice(Activity.RESULT_OK);
                    }
                })
                .setNegativeButton(R.string.option_time_picker, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        choice="time";
                        sendChoice(Activity.RESULT_OK);
                    }
                })
                .create();

    }
}
