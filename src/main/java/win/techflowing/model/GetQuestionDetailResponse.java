package win.techflowing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 获取题目详情返回体
 */
public class GetQuestionDetailResponse {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private boolean isCurrentUserAuthenticated;
        private QuestionBean question;
        private InterviewedBean interviewed;
        private Object subscribeUrl;
        private boolean isPremium;
        private String loginUrl;

        public boolean isCurrentUserAuthenticated() {
            return isCurrentUserAuthenticated;
        }

        public void setCurrentUserAuthenticated(boolean currentUserAuthenticated) {
            this.isCurrentUserAuthenticated = currentUserAuthenticated;
        }

        public QuestionBean getQuestion() {
            return question;
        }

        public void setQuestion(QuestionBean question) {
            this.question = question;
        }

        public InterviewedBean getInterviewed() {
            return interviewed;
        }

        public void setInterviewed(InterviewedBean interviewed) {
            this.interviewed = interviewed;
        }

        public Object getSubscribeUrl() {
            return subscribeUrl;
        }

        public void setSubscribeUrl(Object subscribeUrl) {
            this.subscribeUrl = subscribeUrl;
        }

        public boolean isIsPremium() {
            return isPremium;
        }

        public void setIsPremium(boolean isPremium) {
            this.isPremium = isPremium;
        }

        public String getLoginUrl() {
            return loginUrl;
        }

        public void setLoginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
        }

        public static class QuestionBean {
            private String questionId;
            private String questionFrontendId;
            private String questionTitle;
            private String translatedTitle;
            private String questionTitleSlug;
            private String content;
            private String translatedContent;
            private String difficulty;
            private String stats;
            private boolean allowDiscuss;
            private String contributors;
            private String similarQuestions;
            private String randomQuestionUrl;
            private String sessionId;
            private String categoryTitle;
            private String submitUrl;
            private String interpretUrl;
            private String codeDefinition;
            private String sampleTestCase;
            private boolean enableTestMode;
            private String metaData;
            private boolean enableRunCode;
            private boolean enableSubmit;
            private boolean judgerAvailable;
            private boolean infoVerified;
            private String envInfo;
            private String urlManager;
            private String article;
            private String questionDetailUrl;
            private Object libraryUrl;
            private Object companyTags;
            private String companyTagStats;
            @SerializedName("__typename")
            private String typename;
            private List<?> mysqlSchemas;
            private List<TopicTagsBean> topicTags;

            public String getQuestionId() {
                return questionId;
            }

            public void setQuestionId(String questionId) {
                this.questionId = questionId;
            }

            public String getQuestionFrontendId() {
                return questionFrontendId;
            }

            public void setQuestionFrontendId(String questionFrontendId) {
                this.questionFrontendId = questionFrontendId;
            }

            public String getQuestionTitle() {
                return questionTitle;
            }

            public void setQuestionTitle(String questionTitle) {
                this.questionTitle = questionTitle;
            }

            public String getTranslatedTitle() {
                return translatedTitle;
            }

            public void setTranslatedTitle(String translatedTitle) {
                this.translatedTitle = translatedTitle;
            }

            public String getQuestionTitleSlug() {
                return questionTitleSlug;
            }

            public void setQuestionTitleSlug(String questionTitleSlug) {
                this.questionTitleSlug = questionTitleSlug;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getTranslatedContent() {
                return translatedContent;
            }

            public void setTranslatedContent(String translatedContent) {
                this.translatedContent = translatedContent;
            }

            public String getDifficulty() {
                return difficulty;
            }

            public void setDifficulty(String difficulty) {
                this.difficulty = difficulty;
            }

            public String getStats() {
                return stats;
            }

            public void setStats(String stats) {
                this.stats = stats;
            }

            public boolean isAllowDiscuss() {
                return allowDiscuss;
            }

            public void setAllowDiscuss(boolean allowDiscuss) {
                this.allowDiscuss = allowDiscuss;
            }

            public String getContributors() {
                return contributors;
            }

            public void setContributors(String contributors) {
                this.contributors = contributors;
            }

            public String getSimilarQuestions() {
                return similarQuestions;
            }

            public void setSimilarQuestions(String similarQuestions) {
                this.similarQuestions = similarQuestions;
            }

            public String getRandomQuestionUrl() {
                return randomQuestionUrl;
            }

            public void setRandomQuestionUrl(String randomQuestionUrl) {
                this.randomQuestionUrl = randomQuestionUrl;
            }

            public String getSessionId() {
                return sessionId;
            }

            public void setSessionId(String sessionId) {
                this.sessionId = sessionId;
            }

            public String getCategoryTitle() {
                return categoryTitle;
            }

            public void setCategoryTitle(String categoryTitle) {
                this.categoryTitle = categoryTitle;
            }

            public String getSubmitUrl() {
                return submitUrl;
            }

            public void setSubmitUrl(String submitUrl) {
                this.submitUrl = submitUrl;
            }

            public String getInterpretUrl() {
                return interpretUrl;
            }

            public void setInterpretUrl(String interpretUrl) {
                this.interpretUrl = interpretUrl;
            }

            public String getCodeDefinition() {
                return codeDefinition;
            }

            public void setCodeDefinition(String codeDefinition) {
                this.codeDefinition = codeDefinition;
            }

            public String getSampleTestCase() {
                return sampleTestCase;
            }

            public void setSampleTestCase(String sampleTestCase) {
                this.sampleTestCase = sampleTestCase;
            }

            public boolean isEnableTestMode() {
                return enableTestMode;
            }

            public void setEnableTestMode(boolean enableTestMode) {
                this.enableTestMode = enableTestMode;
            }

            public String getMetaData() {
                return metaData;
            }

            public void setMetaData(String metaData) {
                this.metaData = metaData;
            }

            public boolean isEnableRunCode() {
                return enableRunCode;
            }

            public void setEnableRunCode(boolean enableRunCode) {
                this.enableRunCode = enableRunCode;
            }

            public boolean isEnableSubmit() {
                return enableSubmit;
            }

            public void setEnableSubmit(boolean enableSubmit) {
                this.enableSubmit = enableSubmit;
            }

            public boolean isJudgerAvailable() {
                return judgerAvailable;
            }

            public void setJudgerAvailable(boolean judgerAvailable) {
                this.judgerAvailable = judgerAvailable;
            }

            public boolean isInfoVerified() {
                return infoVerified;
            }

            public void setInfoVerified(boolean infoVerified) {
                this.infoVerified = infoVerified;
            }

            public String getEnvInfo() {
                return envInfo;
            }

            public void setEnvInfo(String envInfo) {
                this.envInfo = envInfo;
            }

            public String getUrlManager() {
                return urlManager;
            }

            public void setUrlManager(String urlManager) {
                this.urlManager = urlManager;
            }

            public String getArticle() {
                return article;
            }

            public void setArticle(String article) {
                this.article = article;
            }

            public String getQuestionDetailUrl() {
                return questionDetailUrl;
            }

            public void setQuestionDetailUrl(String questionDetailUrl) {
                this.questionDetailUrl = questionDetailUrl;
            }

            public Object getLibraryUrl() {
                return libraryUrl;
            }

            public void setLibraryUrl(Object libraryUrl) {
                this.libraryUrl = libraryUrl;
            }

            public Object getCompanyTags() {
                return companyTags;
            }

            public void setCompanyTags(Object companyTags) {
                this.companyTags = companyTags;
            }

            public String getCompanyTagStats() {
                return companyTagStats;
            }

            public void setCompanyTagStats(String companyTagStats) {
                this.companyTagStats = companyTagStats;
            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }

            public List<?> getMysqlSchemas() {
                return mysqlSchemas;
            }

            public void setMysqlSchemas(List<?> mysqlSchemas) {
                this.mysqlSchemas = mysqlSchemas;
            }

            public List<TopicTagsBean> getTopicTags() {
                return topicTags;
            }

            public void setTopicTags(List<TopicTagsBean> topicTags) {
                this.topicTags = topicTags;
            }

            public static class TopicTagsBean {
                /**
                 * name : Array
                 * slug : array
                 * translatedName : 数组
                 * __typename : TopicTagNode
                 */

                private String name;
                private String slug;
                private String translatedName;
                @SerializedName("__typename")
                private String typename;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }

                public String getTranslatedName() {
                    return translatedName;
                }

                public void setTranslatedName(String translatedName) {
                    this.translatedName = translatedName;
                }

                public String getTypename() {
                    return typename;
                }

                public void setTypename(String typename) {
                    this.typename = typename;
                }
            }
        }

        public static class InterviewedBean {
            /**
             * interviewedUrl : /problems/api/interviewed/
             * companies : [{"id":552,"name":"Adobe","slug":"adobe","__typename":"InterviewCompanyOption"},{"id":480,"name":"Aetion","slug":"aetion","__typename":"InterviewCompanyOption"},{"id":522,"name":"Affirm","slug":"affirm","__typename":"InterviewCompanyOption"},{"id":549,"name":"Airbnb","slug":"airbnb","__typename":"InterviewCompanyOption"},{"id":510,"name":"Akuna Capital","slug":"akuna-capital","__typename":"InterviewCompanyOption"},{"id":497,"name":"Alibaba","slug":"alibaba","__typename":"InterviewCompanyOption"},{"id":544,"name":"Amazon","slug":"amazon","__typename":"InterviewCompanyOption"},{"id":473,"name":"AppDynamics","slug":"appdynamics","__typename":"InterviewCompanyOption"},{"id":548,"name":"Apple","slug":"apple","__typename":"InterviewCompanyOption"},{"id":458,"name":"Baidu","slug":"baidu","__typename":"InterviewCompanyOption"},{"id":545,"name":"Bloomberg","slug":"bloomberg","__typename":"InterviewCompanyOption"},{"id":519,"name":"Citadel","slug":"citadel","__typename":"InterviewCompanyOption"},{"id":493,"name":"Cloudera","slug":"cloudera","__typename":"InterviewCompanyOption"},{"id":454,"name":"Coupang","slug":"coupang","__typename":"InterviewCompanyOption"},{"id":488,"name":"Coursera","slug":"coursera","__typename":"InterviewCompanyOption"},{"id":511,"name":"databricks","slug":"databricks","__typename":"InterviewCompanyOption"},{"id":485,"name":"DoorDash","slug":"doordash","__typename":"InterviewCompanyOption"},{"id":523,"name":"Drawbridge","slug":"drawbridge","__typename":"InterviewCompanyOption"},{"id":553,"name":"Dropbox","slug":"dropbox","__typename":"InterviewCompanyOption"},{"id":482,"name":"eBay","slug":"ebay","__typename":"InterviewCompanyOption"},{"id":471,"name":"Epic Systems","slug":"epic-systems","__typename":"InterviewCompanyOption"},{"id":483,"name":"Expedia","slug":"expedia","__typename":"InterviewCompanyOption"},{"id":542,"name":"Facebook","slug":"facebook","__typename":"InterviewCompanyOption"},{"id":495,"name":"Fallible","slug":"fallible","__typename":"InterviewCompanyOption"},{"id":52738,"name":"ForUsAll","slug":"forusall","__typename":"InterviewCompanyOption"},{"id":52665,"name":"Garena","slug":"garena","__typename":"InterviewCompanyOption"},{"id":513,"name":"GE Digital","slug":"ge-digital","__typename":"InterviewCompanyOption"},{"id":500,"name":"Gilt Groupe","slug":"gilt-groupe","__typename":"InterviewCompanyOption"},{"id":481,"name":"GoDaddy","slug":"godaddy","__typename":"InterviewCompanyOption"},{"id":512,"name":"Goldman Sachs","slug":"goldman-sachs","__typename":"InterviewCompanyOption"},{"id":560,"name":"Google","slug":"google","__typename":"InterviewCompanyOption"},{"id":514,"name":"Helix","slug":"helix","__typename":"InterviewCompanyOption"},{"id":509,"name":"Houzz","slug":"houzz","__typename":"InterviewCompanyOption"},{"id":475,"name":"Hulu","slug":"hulu","__typename":"InterviewCompanyOption"},{"id":52941,"name":"IIT Bombay","slug":"iit-bombay","__typename":"InterviewCompanyOption"},{"id":487,"name":"Indeed","slug":"indeed","__typename":"InterviewCompanyOption"},{"id":524,"name":"inmobi","slug":"inmobi","__typename":"InterviewCompanyOption"},{"id":489,"name":"Intuit","slug":"intuit","__typename":"InterviewCompanyOption"},{"id":447,"name":"IXL","slug":"ixl","__typename":"InterviewCompanyOption"},{"id":486,"name":"Jingchi","slug":"jingchi","__typename":"InterviewCompanyOption"},{"id":547,"name":"LinkedIn","slug":"linkedin","__typename":"InterviewCompanyOption"},{"id":505,"name":"LiveRamp","slug":"liveramp","__typename":"InterviewCompanyOption"},{"id":484,"name":"Lyft","slug":"lyft","__typename":"InterviewCompanyOption"},{"id":517,"name":"Machine Zone","slug":"machine-zone","__typename":"InterviewCompanyOption"},{"id":490,"name":"MAQ Software","slug":"maq-software","__typename":"InterviewCompanyOption"},{"id":479,"name":"Mathworks","slug":"mathworks","__typename":"InterviewCompanyOption"},{"id":543,"name":"Microsoft","slug":"microsoft","__typename":"InterviewCompanyOption"},{"id":501,"name":"NetEase","slug":"netease","__typename":"InterviewCompanyOption"},{"id":507,"name":"Netsuite","slug":"netsuite","__typename":"InterviewCompanyOption"},{"id":461,"name":"Palantir","slug":"palantir","__typename":"InterviewCompanyOption"},{"id":478,"name":"Pinterest","slug":"pinterest","__typename":"InterviewCompanyOption"},{"id":448,"name":"Pocket Gems","slug":"pocket-gems","__typename":"InterviewCompanyOption"},{"id":579,"name":"Pony.ai","slug":"ponyai","__typename":"InterviewCompanyOption"},{"id":508,"name":"Poynt","slug":"poynt","__typename":"InterviewCompanyOption"},{"id":506,"name":"Pure Storage","slug":"pure-storage","__typename":"InterviewCompanyOption"},{"id":525,"name":"Quip","slug":"quip","__typename":"InterviewCompanyOption"},{"id":518,"name":"Quora","slug":"quora","__typename":"InterviewCompanyOption"},{"id":492,"name":"Rackspace","slug":"rackspace","__typename":"InterviewCompanyOption"},{"id":521,"name":"Radius","slug":"radius","__typename":"InterviewCompanyOption"},{"id":494,"name":"Riot Games","slug":"riot-games","__typename":"InterviewCompanyOption"},{"id":52666,"name":"Roblox","slug":"roblox","__typename":"InterviewCompanyOption"},{"id":520,"name":"Rubrik","slug":"rubrik","__typename":"InterviewCompanyOption"},{"id":502,"name":"Samsung","slug":"samsung","__typename":"InterviewCompanyOption"},{"id":449,"name":"Snapchat","slug":"snapchat","__typename":"InterviewCompanyOption"},{"id":462,"name":"Square","slug":"square","__typename":"InterviewCompanyOption"},{"id":496,"name":"Tencent","slug":"tencent","__typename":"InterviewCompanyOption"},{"id":516,"name":"TripleByte","slug":"triplebyte","__typename":"InterviewCompanyOption"},{"id":564,"name":"Twitter","slug":"twitter","__typename":"InterviewCompanyOption"},{"id":451,"name":"Two Sigma","slug":"two-sigma","__typename":"InterviewCompanyOption"},{"id":546,"name":"Uber","slug":"uber","__typename":"InterviewCompanyOption"},{"id":498,"name":"Valve","slug":"valve","__typename":"InterviewCompanyOption"},{"id":499,"name":"WAP","slug":"wap","__typename":"InterviewCompanyOption"},{"id":578,"name":"Wish","slug":"wish","__typename":"InterviewCompanyOption"},{"id":565,"name":"Works Applications","slug":"works-applications","__typename":"InterviewCompanyOption"},{"id":551,"name":"Yahoo","slug":"yahoo","__typename":"InterviewCompanyOption"},{"id":515,"name":"Yatra","slug":"yatra","__typename":"InterviewCompanyOption"},{"id":550,"name":"Yelp","slug":"yelp","__typename":"InterviewCompanyOption"},{"id":504,"name":"Zappos","slug":"zappos","__typename":"InterviewCompanyOption"},{"id":561,"name":"Zenefits","slug":"zenefits","__typename":"InterviewCompanyOption"},{"id":568,"name":"今日头条","slug":"jin-ri-tou-tiao","__typename":"InterviewCompanyOption"},{"id":566,"name":"华为","slug":"hua-wei","__typename":"InterviewCompanyOption"},{"id":577,"name":"字节跳动","slug":"zi-jie-tiao-dong","__typename":"InterviewCompanyOption"},{"id":576,"name":"小米","slug":"xiao-mi","__typename":"InterviewCompanyOption"},{"id":572,"name":"爱奇艺","slug":"ai-qi-yi","__typename":"InterviewCompanyOption"},{"id":569,"name":"青牛软件","slug":"qing-niu-ruan-jian","__typename":"InterviewCompanyOption"}]
             * timeOptions : [{"id":0,"name":"last week","__typename":"InterviewTimeOption"},{"id":1,"name":"last month","__typename":"InterviewTimeOption"},{"id":2,"name":"last 3 month","__typename":"InterviewTimeOption"},{"id":3,"name":"last 6 month","__typename":"InterviewTimeOption"},{"id":4,"name":"more than 6 months","__typename":"InterviewTimeOption"},{"id":5,"name":"other","__typename":"InterviewTimeOption"}]
             * stageOptions : [{"id":0,"name":"Online Assessment","__typename":"InterviewStageOption"},{"id":1,"name":"Phone Interview","__typename":"InterviewStageOption"},{"id":4,"name":"On Campus Interview","__typename":"InterviewStageOption"},{"id":2,"name":"Onsite Interview","__typename":"InterviewStageOption"},{"id":3,"name":"Don't know","__typename":"InterviewStageOption"}]
             * __typename : InterviewSurveyNode
             */

            private String interviewedUrl;
            @SerializedName("__typename")
            private String typename;
            private List<CompaniesBean> companies;
            private List<TimeOptionsBean> timeOptions;
            private List<StageOptionsBean> stageOptions;

            public String getInterviewedUrl() {
                return interviewedUrl;
            }

            public void setInterviewedUrl(String interviewedUrl) {
                this.interviewedUrl = interviewedUrl;
            }

            public String getTypename() {
                return typename;
            }

            public void setTypename(String typename) {
                this.typename = typename;
            }

            public List<CompaniesBean> getCompanies() {
                return companies;
            }

            public void setCompanies(List<CompaniesBean> companies) {
                this.companies = companies;
            }

            public List<TimeOptionsBean> getTimeOptions() {
                return timeOptions;
            }

            public void setTimeOptions(List<TimeOptionsBean> timeOptions) {
                this.timeOptions = timeOptions;
            }

            public List<StageOptionsBean> getStageOptions() {
                return stageOptions;
            }

            public void setStageOptions(List<StageOptionsBean> stageOptions) {
                this.stageOptions = stageOptions;
            }

            public static class CompaniesBean {
                /**
                 * id : 552
                 * name : Adobe
                 * slug : adobe
                 * __typename : InterviewCompanyOption
                 */

                private int id;
                private String name;
                private String slug;
                @SerializedName("__typename")
                private String typename;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }

                public String getTypename() {
                    return typename;
                }

                public void setTypename(String typename) {
                    this.typename = typename;
                }
            }

            public static class TimeOptionsBean {
                /**
                 * id : 0
                 * name : last week
                 * __typename : InterviewTimeOption
                 */

                private int id;
                private String name;
                @SerializedName("__typename")
                private String typename;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getTypename() {
                    return typename;
                }

                public void setTypename(String typename) {
                    this.typename = typename;
                }
            }

            public static class StageOptionsBean {
                /**
                 * id : 0
                 * name : Online Assessment
                 * __typename : InterviewStageOption
                 */

                private int id;
                private String name;
                @SerializedName("__typename")
                private String typename;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getTypename() {
                    return typename;
                }

                public void setTypename(String typename) {
                    this.typename = typename;
                }
            }
        }
    }
}
