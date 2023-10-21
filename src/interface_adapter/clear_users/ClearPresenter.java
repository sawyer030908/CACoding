package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import javax.swing.*;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }

    public void prepareSuccessView(ClearOutputData clearOutputData) {
        ClearState clearState = clearViewModel.getState();
        JOptionPane.showMessageDialog(null, clearOutputData.getNameText());
        clearViewModel.firePropertyChanged();
    }
}
