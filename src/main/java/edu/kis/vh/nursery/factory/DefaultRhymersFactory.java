package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
<<<<<<< HEAD
import edu.kis.vh.nursery.FifoRhymer;
=======
import edu.kis.vh.nursery.FIFORhymer;
>>>>>>> class-method-naming
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
<<<<<<< HEAD
	public DefaultCountingOutRhymer GetStandardRhymer() {
=======
	public DefaultCountingOutRhymer getStandardRhymer() {
>>>>>>> class-method-naming
		return new DefaultCountingOutRhymer();
	}

	@Override
<<<<<<< HEAD
	public DefaultCountingOutRhymer GetFalseRhymer() {
=======
	public DefaultCountingOutRhymer getFalseRhymer() {
>>>>>>> class-method-naming
		return new DefaultCountingOutRhymer();
	}

	@Override
<<<<<<< HEAD
	public DefaultCountingOutRhymer GetFIFORhymer() {
		return new FifoRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
=======
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
>>>>>>> class-method-naming
		return new HanoiRhymer();
	}

}
