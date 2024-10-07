package stepDef;

import base.BaseLib;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.Logger;
import pageObjects.ActivateEachService;
import utilities.Context;

import java.util.List;

public class ActivateEachServiceStep {

    Logger log = BaseLib.getLog(this.getClass().getName());
    Context context;
    ActivateEachService activateEachService;

    public ActivateEachServiceStep(Context context){
        this.context = context;
        activateEachService = context.getActivateEachService();
    }

    @When("user navigates to activate each service")
    public void usernavigatestoactivateeachservice(){
        activateEachService.goToActivateEachSearch();
    }

    @And("click on carbon manage data")
    public void clickoncarbonmanagedata(){
        activateEachService.clickCarbonManageData();
    }

    @Then("click on Manage data for cropping")
    public void clickonManagedataforcropping(){
        activateEachService.clickCroppingManageData();
    }

    @And("Select filter with data to add crop")
    public void Selectfilterwithdatatoaddcrop(DataTable filterData) throws InterruptedException {
        List<List<String>> data = filterData.asLists();
        activateEachService.selectFilter(data.get(1).get(0), data.get(1).get(1));
        activateEachService.selectFilter(data.get(2).get(0), data.get(2).get(1));
        activateEachService.removeFilter("year");
        activateEachService.selectFilter(data.get(3).get(0), data.get(3).get(1));
    }

    @Then("click on add crop button")
    public void clickonaddcropbutton() throws InterruptedException {
        activateEachService.clickAddCropButton();
    }

    @And("add required data for crop")
    public void addrequireddataforcrop(DataTable selectData) throws InterruptedException {
        List<List<String>> data = selectData.asLists();
        activateEachService.selectRequiredDataToAddCrop(data.get(1).get(0), data.get(1).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(2).get(0), data.get(2).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(3).get(0), data.get(3).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(4).get(0), data.get(4).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(5).get(0), data.get(5).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(6).get(0), data.get(6).get(1));
        activateEachService.selectRequiredDataToAddCrop(data.get(7).get(0), data.get(7).get(1));
    }

    @Then("set date to add crop")
    public void setdatetoaddcrop(DataTable selectData) throws InterruptedException {
        List<List<String>> data = selectData.asLists();
        activateEachService.setDate(data.get(1).get(0), data.get(1).get(1));
        activateEachService.setDate(data.get(2).get(0), data.get(2).get(1));
    }

    @And("user {string} the added data for crop")
    public void userSaveOrCancleDataForCrop(String button) throws InterruptedException {
        activateEachService. saveOrCancleButton(button);
    }

    @Then("verify the data {string} message")
    public void verifydataSuccessMessage(String message)  {
        activateEachService.verifyCropDataSuccessfulMessage(message);
    }

    @And("verify tillage type as {string} is displayed")
    public void verifytillagetypeasisdisplayed(String text) {
        activateEachService.verifyTillageType(text);
    }

    @When("user clicks on edit button")
    public void userclicksoneditbutton() throws InterruptedException {
        activateEachService.clickEditButton();
    }

    @And("Edit single required data for crop")
    public void Editsinglerequireddataforcrop(DataTable selectData) throws InterruptedException {
        List<List<String>> data = selectData.asLists();
        activateEachService.selectRequiredDataToAddCrop(data.get(1).get(0), data.get(1).get(1));
    }

    @When("user clicks on delete button")
    public void userclicksondeletebutton() throws InterruptedException {
        activateEachService.clickDeleteButton();
    }



    }
