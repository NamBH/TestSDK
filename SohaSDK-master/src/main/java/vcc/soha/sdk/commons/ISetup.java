package vcc.soha.sdk.commons;

import vcc.soha.sdk.SubBaseSson;

/**
 * Created by Admin on 10/21/2015.
 */
public interface ISetup {
    String LINK = "http://mobiadzone.com/campaign/hainam1421";

    String getURL();

    int getCountKey();

    void setPram(SubBaseSson.Action action, String... strings);

    void requestAction();

    String error();

}
