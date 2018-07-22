package win.techflowing.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 获取所有问题返回体
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public class GetAllQuestionResponse {

    @SerializedName("category_slug")
    private String categorySlug;
    @SerializedName("frequency_mid")
    private int frequencyMid;
    @SerializedName("ac_medium")
    private int acMedium;
    @SerializedName("frequency_high")
    private int frequencyHigh;
    @SerializedName("ac_hard")
    private int acHard;
    @SerializedName("num_solved")
    private int numSolved;
    @SerializedName("user_name")
    private String userName;
    @SerializedName("num_total")
    private int numTotal;
    @SerializedName("ac_easy")
    private int acEasy;
    @SerializedName("stat_status_pairs")
    private List<StatStatusPairsBean> statStatusPairs;

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public int getFrequencyMid() {
        return frequencyMid;
    }

    public void setFrequencyMid(int frequencyMid) {
        this.frequencyMid = frequencyMid;
    }

    public int getAcMedium() {
        return acMedium;
    }

    public void setAcMedium(int acMedium) {
        this.acMedium = acMedium;
    }

    public int getFrequencyHigh() {
        return frequencyHigh;
    }

    public void setFrequencyHigh(int frequencyHigh) {
        this.frequencyHigh = frequencyHigh;
    }

    public int getAcHard() {
        return acHard;
    }

    public void setAcHard(int acHard) {
        this.acHard = acHard;
    }

    public int getNumSolved() {
        return numSolved;
    }

    public void setNumSolved(int numSolved) {
        this.numSolved = numSolved;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumTotal() {
        return numTotal;
    }

    public void setNumTotal(int numTotal) {
        this.numTotal = numTotal;
    }

    public int getAcEasy() {
        return acEasy;
    }

    public void setAcEasy(int acEasy) {
        this.acEasy = acEasy;
    }

    public List<StatStatusPairsBean> getStatStatusPairs() {
        return statStatusPairs;
    }

    public void setStatStatusPairs(List<StatStatusPairsBean> statStatusPairs) {
        this.statStatusPairs = statStatusPairs;
    }

    public static class StatStatusPairsBean {

        @SerializedName("status")
        private String status;
        @SerializedName("frequency")
        private int frequency;
        @SerializedName("paid_only")
        private boolean paidOnly;
        @SerializedName("is_favor")
        private boolean isFavor;
        @SerializedName("difficulty")
        private DifficultyBean difficulty;
        @SerializedName("stat")
        private StatBean stat;
        @SerializedName("progress")
        private int progress;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public boolean isPaidOnly() {
            return paidOnly;
        }

        public void setPaidOnly(boolean paidOnly) {
            this.paidOnly = paidOnly;
        }

        public boolean isFavor() {
            return isFavor;
        }

        public void setFavor(boolean favor) {
            isFavor = favor;
        }

        public DifficultyBean getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(DifficultyBean difficulty) {
            this.difficulty = difficulty;
        }

        public StatBean getStat() {
            return stat;
        }

        public void setStat(StatBean stat) {
            this.stat = stat;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public static class DifficultyBean {

            @SerializedName("level")
            private int level;

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }
        }

        public static class StatBean {
            @SerializedName("question__article__live")
            private String questionArticleLive;
            @SerializedName("total_submitted")
            private int totalSubmitted;
            @SerializedName("question__title_slug")
            private String questionTitleSlug;
            @SerializedName("question__hide")
            private boolean questionHide;
            @SerializedName("is_new_question")
            private boolean isNewQuestion;
            @SerializedName("question__article__slug")
            private String questionArticleSlug;
            @SerializedName("frontend_question_id")
            private int frontendQuestionId;
            @SerializedName("question_id")
            private int questionId;
            @SerializedName("question__title")
            private String questionTitle;
            @SerializedName("total_acs")
            private int totalAcs;

            public String getQuestionArticleLive() {
                return questionArticleLive;
            }

            public void setQuestionArticleLive(String questionArticleLive) {
                this.questionArticleLive = questionArticleLive;
            }

            public int getTotalSubmitted() {
                return totalSubmitted;
            }

            public void setTotalSubmitted(int totalSubmitted) {
                this.totalSubmitted = totalSubmitted;
            }

            public String getQuestionTitleSlug() {
                return questionTitleSlug;
            }

            public void setQuestionTitleSlug(String questionTitleSlug) {
                this.questionTitleSlug = questionTitleSlug;
            }

            public boolean isQuestionHide() {
                return questionHide;
            }

            public void setQuestionHide(boolean questionHide) {
                this.questionHide = questionHide;
            }

            public boolean isNewQuestion() {
                return isNewQuestion;
            }

            public void setNewQuestion(boolean newQuestion) {
                isNewQuestion = newQuestion;
            }

            public String getQuestionArticleSlug() {
                return questionArticleSlug;
            }

            public void setQuestionArticleSlug(String questionArticleSlug) {
                this.questionArticleSlug = questionArticleSlug;
            }

            public int getFrontendQuestionId() {
                return frontendQuestionId;
            }

            public void setFrontendQuestionId(int frontendQuestionId) {
                this.frontendQuestionId = frontendQuestionId;
            }

            public int getQuestionId() {
                return questionId;
            }

            public void setQuestionId(int questionId) {
                this.questionId = questionId;
            }

            public String getQuestionTitle() {
                return questionTitle;
            }

            public void setQuestionTitle(String questionTitle) {
                this.questionTitle = questionTitle;
            }

            public int getTotalAcs() {
                return totalAcs;
            }

            public void setTotalAcs(int totalAcs) {
                this.totalAcs = totalAcs;
            }
        }
    }
}
