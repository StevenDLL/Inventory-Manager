package StevenDLL.Controllers;

import StevenDLL.EntryPoint;
import StevenDLL.InventoryItem;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class inAppController {
    public AnchorPane mainPane;
    public Tab dashboard_Tab;
    public Tab inventory_Tab;
    public Tab settings_Tab;

    public ChoiceBox search_ChoiceBox;
    private final String[] searchBy = {
            "Any",
            "Product ID",
            "Title",
            "Description",
            "Location",
            "Quantity"
    };
    public TextField search_TextField;
    public Label filterBy_Label;
    public TableView inventory_TableView;
    public TableColumn productID_TableColumn;
    public TableColumn title_TableColumn;
    public TableColumn storeLocation_TableColumn;
    public TableColumn aisleNumber_TableColumn;
    public TableColumn quantity_TableColumn;
    public TableColumn price_TableColumn;
    public Button refresh_Button;
    public Button newItem_Button;
    public Button removeSelected_Button;

    protected void setDefaultFields() {
        if (!(search_ChoiceBox.getItems().contains("Any"))) {
            for (int i = 0; i < searchBy.length; i++) {
                search_ChoiceBox.getItems().add(searchBy[i]);
                if (search_ChoiceBox.getSelectionModel().getSelectedItem() == null) {
                    search_ChoiceBox.getSelectionModel().select(0);
                }
            }
        }
        search_ChoiceBox.setTooltip(new Tooltip("Select the category you would like to search through"));
        PropertyValueFactory<InventoryItem, String> productID_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("productID");
        productID_TableColumn.setCellValueFactory(productID_PropertyValueFactory);

        PropertyValueFactory<InventoryItem, String> title_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("title");
        title_TableColumn.setCellValueFactory(title_PropertyValueFactory);

        PropertyValueFactory<InventoryItem, String> storeLocation_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("storeLocation");
        storeLocation_TableColumn.setCellValueFactory(storeLocation_PropertyValueFactory);

        PropertyValueFactory<InventoryItem, String> aisleNumber_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("aisleNumber");
        aisleNumber_TableColumn.setCellValueFactory(aisleNumber_PropertyValueFactory);

        PropertyValueFactory<InventoryItem, String> quantity_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("quantity");
        quantity_TableColumn.setCellValueFactory(quantity_PropertyValueFactory);

        PropertyValueFactory<InventoryItem, String> price_PropertyValueFactory = new PropertyValueFactory<InventoryItem, String>("price");
        price_TableColumn.setCellValueFactory(price_PropertyValueFactory);

        InventoryItem x = new InventoryItem();


        inventory_TableView.getItems().add(x);
    }

    public void clicked(MouseEvent mouseEvent) {
        setDefaultFields();

    }

    public void newItemButton_Clicked(MouseEvent mouseEvent) {
        EntryPoint.SCENE_MANAGER.setCurrentScene(2);
    }
}
