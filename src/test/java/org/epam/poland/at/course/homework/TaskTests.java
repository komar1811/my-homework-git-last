package org.epam.poland.at.course.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTests {

    @Test
    public void TaskTest11() {
        Assert.assertTrue(Tasks.Task11().contains("99801"));
    }
    @Test
    public void testTask12() {
        Assert.assertTrue(Tasks.Task12());
    }

    @Test
    public void testTask13() { Assert.assertTrue(Tasks.Task13());
    }
}
