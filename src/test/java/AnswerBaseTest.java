import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerBaseTest {
    @Test
    void testAgeQuestion(){
        final String expDiffAnswer = "Поговорим о чем-нибудь другом?";
        assert(expDiffAnswer.equals(AnswerBase.DIFFERENT.getAnswer()));
    }
}