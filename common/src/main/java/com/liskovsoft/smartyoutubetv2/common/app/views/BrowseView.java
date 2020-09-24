package com.liskovsoft.smartyoutubetv2.common.app.views;

import com.liskovsoft.smartyoutubetv2.common.app.models.signin.ErrorFragmentData;
import com.liskovsoft.smartyoutubetv2.common.app.models.data.Header;
import com.liskovsoft.smartyoutubetv2.common.app.models.data.VideoGroup;

public interface BrowseView {
    void updateHeader(VideoGroup row);
    void updateHeaderIfEmpty(ErrorFragmentData data);
    void clearHeader(Header header);
    void showProgressBar(boolean show);
}
