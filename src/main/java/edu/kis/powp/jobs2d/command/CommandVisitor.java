package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandVisitor implements CommandVisitorInterface
{
    Job2dDriver job2dDriver;

    public CommandVisitor(Job2dDriver driver)
    {
        this.job2dDriver = driver;
    }

    @Override
    public void visit(OperateToCommand driver)
    {
        driver.execute(this.job2dDriver);
    }

    @Override
    public void visit(SetPositionCommand driver)
    {
        driver.execute(this.job2dDriver);
    }

    @Override
    public void visit(ICompoundCommand driver)
    {
        driver.execute(this.job2dDriver);
    }
}
