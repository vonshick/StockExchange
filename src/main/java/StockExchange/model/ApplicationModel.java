package StockExchange.model;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class ApplicationModel {

    private ObservableList<StockMarket> stockMarkets;
    private ObservableList<Index> indexes;
    private ObservableList<Material> materials;
    private ObservableList<Currency> currencies;
    private ObservableList<Company> companies;
    private CurrencyMarket currencyMarket;
    private ObservableList<MaterialMarket> materialMarkets;
    private ObservableList<Investor> investors;
    private ObservableList<InvestmentFund> investmentFunds;

    private static ApplicationModel instance;

    private ApplicationModel() {
        initializeModels();
    }

    private void initializeModels() {
        stockMarkets = FXCollections.observableArrayList();
        indexes = FXCollections.observableArrayList();
        materials = FXCollections.observableArrayList();
        currencies = FXCollections.observableArrayList();
        companies = FXCollections.observableArrayList();
        currencyMarket = new CurrencyMarket();
        materialMarkets = FXCollections.observableArrayList();
        investors = FXCollections.observableArrayList();
        investmentFunds = FXCollections.observableArrayList();

        currencies.addListener(this::onCurrencyAdded);
    }

    private void onCurrencyAdded(ListChangeListener.Change<? extends Currency> c) {
        if(c.next()) {
            for (Currency currency : c.getAddedSubList()) {
                currencyMarket.addCurrency(currency);
            }
        }
    }

    public static ApplicationModel getInstance() {
        if (instance == null) {
            instance = new ApplicationModel();
        }
        return instance;
    }

    /**
     *
     * @return
     */
    public ObservableList<StockMarket> getStockMarkets() {
        return stockMarkets;
    }

    /**
     *
     * @return
     */
    public ObservableList<Index> getIndexes() {
        return indexes;
    }

    /**
     *
     * @return
     */
    public ObservableList<Material> getMaterials() {
        return materials;
    }

    public ObservableList<Currency> getCurrencies() {
        return currencies;
    }

    /**
     *
     * @return
     */
    public ObservableList<Company> getCompanies() {
        return companies;
    }

    /**
     *
     * @return
     */
    public ObservableList<MaterialMarket> getMaterialMarkets() { return materialMarkets; }

    /**
     *
     * @return
     */
    public ObservableList<Investor> getInvestors() {
        return investors;
    }

    /**
     *
     * @return
     */
    public ObservableList<InvestmentFund> getInvestmentFunds() {
        return investmentFunds;
    }

    /**
     *
     * @return
     */
    public CurrencyMarket getCurrencyMarket() {
        return currencyMarket;
    }
}
