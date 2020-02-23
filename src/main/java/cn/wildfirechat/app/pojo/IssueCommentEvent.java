package cn.wildfirechat.app.pojo;

import com.google.gson.Gson;

//https://developer.github.com/v3/activity/events/types/#issuecommentevent
public class IssueCommentEvent {
    //The action that was performed on the comment. Can be one of created, edited, or deleted.
    public String action;
    public Issue issue;
    public Comment comment;
    public Repository repository;
    public User sender;

    public static IssueCommentEvent fromJson(String jsonStr) {
        IssueCommentEvent issueCommentEvent = new Gson().fromJson(jsonStr, IssueCommentEvent.class);
        return issueCommentEvent;
    }

    public static void main(String[] args) {
        String event1 = "{\"action\":\"created\",\"issue\":{\"url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/1\",\"repository_url\":\"https://api.github.com/repos/wildfirechat/github_webhook\",\"labels_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/1/labels{/name}\",\"comments_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/1/comments\",\"events_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/1/events\",\"html_url\":\"https://github.com/wildfirechat/github_webhook/issues/1\",\"id\":569491189,\"node_id\":\"MDU6SXNzdWU1Njk0OTExODk=\",\"number\":1,\"title\":\"test issue\",\"user\":{\"login\":\"heavyrain2012\",\"id\":34463389,\"node_id\":\"MDQ6VXNlcjM0NDYzMzg5\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/34463389?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/heavyrain2012\",\"html_url\":\"https://github.com/heavyrain2012\",\"followers_url\":\"https://api.github.com/users/heavyrain2012/followers\",\"following_url\":\"https://api.github.com/users/heavyrain2012/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/heavyrain2012/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/heavyrain2012/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/heavyrain2012/subscriptions\",\"organizations_url\":\"https://api.github.com/users/heavyrain2012/orgs\",\"repos_url\":\"https://api.github.com/users/heavyrain2012/repos\",\"events_url\":\"https://api.github.com/users/heavyrain2012/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/heavyrain2012/received_events\",\"type\":\"User\",\"site_admin\":false},\"labels\":[],\"state\":\"open\",\"locked\":false,\"assignee\":null,\"assignees\":[],\"milestone\":null,\"comments\":0,\"created_at\":\"2020-02-23T12:57:10Z\",\"updated_at\":\"2020-02-23T14:04:17Z\",\"closed_at\":null,\"author_association\":\"CONTRIBUTOR\",\"body\":\"this is a test issue\"},\"comment\":{\"url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/comments/590072058\",\"html_url\":\"https://github.com/wildfirechat/github_webhook/issues/1#issuecomment-590072058\",\"issue_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/1\",\"id\":590072058,\"node_id\":\"MDEyOklzc3VlQ29tbWVudDU5MDA3MjA1OA==\",\"user\":{\"login\":\"heavyrain2012\",\"id\":34463389,\"node_id\":\"MDQ6VXNlcjM0NDYzMzg5\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/34463389?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/heavyrain2012\",\"html_url\":\"https://github.com/heavyrain2012\",\"followers_url\":\"https://api.github.com/users/heavyrain2012/followers\",\"following_url\":\"https://api.github.com/users/heavyrain2012/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/heavyrain2012/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/heavyrain2012/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/heavyrain2012/subscriptions\",\"organizations_url\":\"https://api.github.com/users/heavyrain2012/orgs\",\"repos_url\":\"https://api.github.com/users/heavyrain2012/repos\",\"events_url\":\"https://api.github.com/users/heavyrain2012/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/heavyrain2012/received_events\",\"type\":\"User\",\"site_admin\":false},\"created_at\":\"2020-02-23T14:04:17Z\",\"updated_at\":\"2020-02-23T14:04:17Z\",\"author_association\":\"CONTRIBUTOR\",\"body\":\"tttt\"},\"repository\":{\"id\":242506330,\"node_id\":\"MDEwOlJlcG9zaXRvcnkyNDI1MDYzMzA=\",\"name\":\"github_webhook\",\"full_name\":\"wildfirechat/github_webhook\",\"private\":false,\"owner\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/wildfirechat\",\"html_url\":\"https://github.com/wildfirechat\",\"followers_url\":\"https://api.github.com/users/wildfirechat/followers\",\"following_url\":\"https://api.github.com/users/wildfirechat/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/wildfirechat/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/wildfirechat/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/wildfirechat/subscriptions\",\"organizations_url\":\"https://api.github.com/users/wildfirechat/orgs\",\"repos_url\":\"https://api.github.com/users/wildfirechat/repos\",\"events_url\":\"https://api.github.com/users/wildfirechat/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/wildfirechat/received_events\",\"type\":\"Organization\",\"site_admin\":false},\"html_url\":\"https://github.com/wildfirechat/github_webhook\",\"description\":\"Github webhook robot applaciton\",\"fork\":false,\"url\":\"https://api.github.com/repos/wildfirechat/github_webhook\",\"forks_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/forks\",\"keys_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/keys{/key_id}\",\"collaborators_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/collaborators{/collaborator}\",\"teams_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/teams\",\"hooks_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/hooks\",\"issue_events_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/events{/number}\",\"events_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/events\",\"assignees_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/assignees{/user}\",\"branches_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/branches{/branch}\",\"tags_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/tags\",\"blobs_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/git/blobs{/sha}\",\"git_tags_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/git/tags{/sha}\",\"git_refs_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/git/refs{/sha}\",\"trees_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/git/trees{/sha}\",\"statuses_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/statuses/{sha}\",\"languages_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/languages\",\"stargazers_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/stargazers\",\"contributors_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/contributors\",\"subscribers_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/subscribers\",\"subscription_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/subscription\",\"commits_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/commits{/sha}\",\"git_commits_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/git/commits{/sha}\",\"comments_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/comments{/number}\",\"issue_comment_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues/comments{/number}\",\"contents_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/contents/{+path}\",\"compare_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/compare/{base}...{head}\",\"merges_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/merges\",\"archive_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/{archive_format}{/ref}\",\"downloads_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/downloads\",\"issues_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/issues{/number}\",\"pulls_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/pulls{/number}\",\"milestones_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/milestones{/number}\",\"notifications_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/notifications{?since,all,participating}\",\"labels_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/labels{/name}\",\"releases_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/releases{/id}\",\"deployments_url\":\"https://api.github.com/repos/wildfirechat/github_webhook/deployments\",\"created_at\":\"2020-02-23T11:41:25Z\",\"updated_at\":\"2020-02-23T13:58:24Z\",\"pushed_at\":\"2020-02-23T13:58:22Z\",\"git_url\":\"git://github.com/wildfirechat/github_webhook.git\",\"ssh_url\":\"git@github.com:wildfirechat/github_webhook.git\",\"clone_url\":\"https://github.com/wildfirechat/github_webhook.git\",\"svn_url\":\"https://github.com/wildfirechat/github_webhook\",\"homepage\":null,\"size\":797,\"stargazers_count\":0,\"watchers_count\":0,\"language\":\"Java\",\"has_issues\":true,\"has_projects\":true,\"has_downloads\":true,\"has_wiki\":true,\"has_pages\":false,\"forks_count\":0,\"mirror_url\":null,\"archived\":false,\"disabled\":false,\"open_issues_count\":1,\"license\":{\"key\":\"other\",\"name\":\"Other\",\"spdx_id\":\"NOASSERTION\",\"url\":null,\"node_id\":\"MDc6TGljZW5zZTA=\"},\"forks\":0,\"open_issues\":1,\"watchers\":0,\"default_branch\":\"master\"},\"organization\":{\"login\":\"wildfirechat\",\"id\":33191460,\"node_id\":\"MDEyOk9yZ2FuaXphdGlvbjMzMTkxNDYw\",\"url\":\"https://api.github.com/orgs/wildfirechat\",\"repos_url\":\"https://api.github.com/orgs/wildfirechat/repos\",\"events_url\":\"https://api.github.com/orgs/wildfirechat/events\",\"hooks_url\":\"https://api.github.com/orgs/wildfirechat/hooks\",\"issues_url\":\"https://api.github.com/orgs/wildfirechat/issues\",\"members_url\":\"https://api.github.com/orgs/wildfirechat/members{/member}\",\"public_members_url\":\"https://api.github.com/orgs/wildfirechat/public_members{/member}\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/33191460?v=4\",\"description\":\"北京野火无限网络科技有限公司--专注于即时通讯技术，提供优质可控的即时通讯能力\"},\"sender\":{\"login\":\"heavyrain2012\",\"id\":34463389,\"node_id\":\"MDQ6VXNlcjM0NDYzMzg5\",\"avatar_url\":\"https://avatars0.githubusercontent.com/u/34463389?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/heavyrain2012\",\"html_url\":\"https://github.com/heavyrain2012\",\"followers_url\":\"https://api.github.com/users/heavyrain2012/followers\",\"following_url\":\"https://api.github.com/users/heavyrain2012/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/heavyrain2012/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/heavyrain2012/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/heavyrain2012/subscriptions\",\"organizations_url\":\"https://api.github.com/users/heavyrain2012/orgs\",\"repos_url\":\"https://api.github.com/users/heavyrain2012/repos\",\"events_url\":\"https://api.github.com/users/heavyrain2012/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/heavyrain2012/received_events\",\"type\":\"User\",\"site_admin\":false}}";
        IssueCommentEvent issueCommentEvent = fromJson(event1);
        System.out.println(issueCommentEvent.action);
    }
}
