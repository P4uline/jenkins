package jenkins.views;

import hudson.Extension;

@Extension
public class JenkinsHeader extends Header {

    @Override
    public boolean isHeaderEnabled() {
        return true;
    }

    @Override
    public Integer priority() {
        return 0;
    }

}
