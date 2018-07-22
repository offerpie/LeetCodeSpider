package win.techflowing.model;

/**
 * 获取题目详情请求体
 */
public class GetQuestionDetailRequest {

    private String operationName;
    private VariablesBean variables;
    private String query;

    public GetQuestionDetailRequest(String questionTitle) {
        operationName = "getQuestionDetail";
        variables = new VariablesBean();
        variables.setTitleSlug(questionTitle);
        query = "query getQuestionDetail($titleSlug: String!) " +
                "{\n  isCurrentUserAuthenticated\n  question(titleSlug: $titleSlug) " +
                "{\n    questionId\n    questionFrontendId\n    questionTitle\n    " +
                "translatedTitle\n    questionTitleSlug\n    content\n    translatedContent\n  " +
                "  difficulty\n    stats\n    allowDiscuss\n    contributors\n    " +
                "similarQuestions\n    mysqlSchemas\n    randomQuestionUrl\n    sessionId\n " +
                "   categoryTitle\n    submitUrl\n    interpretUrl\n    codeDefinition\n  " +
                "  sampleTestCase\n    enableTestMode\n    metaData\n    enableRunCode\n  " +
                "  enableSubmit\n    judgerAvailable\n    infoVerified\n    envInfo\n   " +
                " urlManager\n    article\n    questionDetailUrl\n    libraryUrl\n    " +
                "companyTags {\n      name\n      slug\n      translatedName\n      " +
                "__typename\n    }\n    companyTagStats\n    topicTags {\n      name\n    " +
                "  slug\n      translatedName\n      __typename\n    }\n    __typename\n  }\n  " +
                "interviewed {\n    interviewedUrl\n    companies {\n      id\n      name\n    " +
                "  slug\n      __typename\n    }\n    timeOptions {\n      id\n      name\n     " +
                " __typename\n    }\n    stageOptions {\n      id\n      name\n      " +
                "__typename\n    }\n    __typename\n  }\n  subscribeUrl\n  isPremium\n  " +
                "loginUrl\n}\n";
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public VariablesBean getVariables() {
        return variables;
    }

    public void setVariables(VariablesBean variables) {
        this.variables = variables;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public static class VariablesBean {

        private String titleSlug;

        public String getTitleSlug() {
            return titleSlug;
        }

        public void setTitleSlug(String titleSlug) {
            this.titleSlug = titleSlug;
        }
    }
}
