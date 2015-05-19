package com.andaily.springoauth.service.impl;

import com.andaily.springoauth.infrastructure.httpclient.HttpResponseHandler;
import com.andaily.springoauth.infrastructure.httpclient.MkkHttpResponse;
import com.andaily.springoauth.infrastructure.json.JsonUtils;
import com.andaily.springoauth.service.dto.UserDto;
import org.apache.http.StatusLine;

/**
 * 15-5-18
 *
 * @author Shengzhao Li
 */
public class UserDtoResponseHandler implements HttpResponseHandler {


    private UserDto userDto;

    public UserDtoResponseHandler() {
    }

    /*
    * Response is JSON or  XML (failed)
    *
    *  Error data:
    *  <oauth><error_description>Invalid access token: 3420d0e0-ed77-45e1-8370-2b55af0a62e8</error_description><error>invalid_token</error></oauth>
    *
    * */
    @Override
    public void handleResponse(MkkHttpResponse response) {
        if (response.isResponse200()) {
            final String text = response.responseAsString();
            this.userDto = JsonUtils.textToBean(new UserDto(), text);
        } else {
            final StatusLine statusLine = response.httpResponse().getStatusLine();
            this.userDto = new UserDto(String.valueOf(statusLine.getStatusCode()), statusLine.getReasonPhrase());
        }
    }

    public UserDto getUserDto() {
        return userDto;
    }
}
