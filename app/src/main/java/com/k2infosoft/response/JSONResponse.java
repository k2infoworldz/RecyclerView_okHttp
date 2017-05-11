package com.k2infosoft.response;


import com.google.gson.annotations.SerializedName;
import com.k2infosoft.model.DocumentDetail;

public class JSONResponse {
    @SerializedName("employees")
    private DocumentDetail[] documentDetails;

    public DocumentDetail[] getDocumentDetails() {
        return documentDetails;
    }
}
