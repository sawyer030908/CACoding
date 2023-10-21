package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessInterface;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessInterface = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    public void execute(ClearInputData clearInputData){
        List<String> deletedNames = userDataAccessInterface.getDeletedName();
        ClearOutputData clearOutputData = new ClearOutputData(deletedNames, false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }

}
