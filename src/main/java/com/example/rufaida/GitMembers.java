package com.example.rufaida;

import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class GitMembers {
    private GitHub gitHub;

    public GitMembers(GitHub gitHub) throws IOException {
        this.gitHub = gitHub;
    }

    List <GHUser>members(String name) throws IOException {
        List<GHUser> members = gitHub.getOrganization(name).getMembers();
        for (GHUser gh : members) {
            System.out.println(gh.getName());
        }
        return members;
    }
}
