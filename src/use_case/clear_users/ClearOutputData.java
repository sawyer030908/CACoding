package use_case.clear_users;

// TODO Complete me

import java.util.List;

public class ClearOutputData {
    private final List<String> deleteNameList;
    private boolean useCaseFailed;

    public ClearOutputData(List<String> deleteNameList, boolean useCaseFailed){
        this.deleteNameList = deleteNameList;
        this.useCaseFailed = useCaseFailed;
    }

    //处理String Name list
}
