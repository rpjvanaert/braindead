package five.miles.failurism.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import com.miles.failurism.R;

public class MainDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_main_title).setMessage(R.string.dialog_main_help).setPositiveButton(R.string.confirm, null);
        return builder.create();
    }
}
