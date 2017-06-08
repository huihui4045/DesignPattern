package proxy.demo;

/**
 * Created by gavin on 2017/6/8.
 */
public class Lawyer implements ILawsuit {

    private ILawsuit mLawsuit;

    public Lawyer(ILawsuit mLawsuit) {
        this.mLawsuit = mLawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void broden() {
        mLawsuit.broden();

    }

    @Override
    public void defend() {

        mLawsuit.defend();
    }

    @Override
    public void finish() {

        mLawsuit.finish();
    }
}
