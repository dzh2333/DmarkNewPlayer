package com.dmark.dmarknewplayer.ui.fragment;

import com.dmark.basemodule.moudle.fragment.ModuleManagerFragment;
import com.dmark.dmarknewplayer.R;

import java.util.ArrayList;
import java.util.HashMap;

public class VideoFragment  extends ModuleManagerFragment {
    @Override
    protected HashMap<String, ArrayList<Integer>> moduleConfig() {
        return null;
    }
    @Override
    protected int layoutId() {
        return R.layout.fragment_video_home;
    }
}
