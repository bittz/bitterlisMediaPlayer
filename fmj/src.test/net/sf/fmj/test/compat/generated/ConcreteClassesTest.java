package net.sf.fmj.test.compat.generated;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import junit.framework.TestCase;

/**
 * 
 * @author Ken Larson
 *
 */
public class ConcreteClassesTest extends TestCase
{
	public void test_javax_media_ResourceUnavailableEvent() throws Exception
	{
		assertEquals(javax.media.ResourceUnavailableEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ResourceUnavailableEvent.class.isInterface());
		assertTrue(javax.media.ResourceUnavailableEvent.class.getSuperclass().equals(javax.media.ControllerErrorEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ResourceUnavailableEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ResourceUnavailableEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ResourceUnavailableEvent o = null;
		o.toString();
		o.getMessage();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ResourceUnavailableEvent o = null;
		new javax.media.ResourceUnavailableEvent((javax.media.Controller) null);
		new javax.media.ResourceUnavailableEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_IncompatibleTimeBaseException() throws Exception
	{
		assertEquals(javax.media.IncompatibleTimeBaseException.class.getModifiers(), 1);
		assertTrue(!javax.media.IncompatibleTimeBaseException.class.isInterface());
		assertTrue(javax.media.IncompatibleTimeBaseException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleTimeBaseException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.IncompatibleTimeBaseException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.IncompatibleTimeBaseException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.IncompatibleTimeBaseException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.IncompatibleTimeBaseException o = null;
		new javax.media.IncompatibleTimeBaseException();
		new javax.media.IncompatibleTimeBaseException((java.lang.String) null);
		}
	}
	public void test_javax_media_MediaEvent() throws Exception
	{
		assertEquals(javax.media.MediaEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.MediaEvent.class.isInterface());
		assertTrue(javax.media.MediaEvent.class.getSuperclass().equals(java.util.EventObject.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.MediaEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.MediaEvent.class.getConstructor(new Class[]{java.lang.Object.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.MediaEvent o = null;
		o.toString();
		o.getSource();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.MediaEvent o = null;
		new javax.media.MediaEvent((java.lang.Object) null);
		}
	}
	public void test_javax_media_DurationUpdateEvent() throws Exception
	{
		assertEquals(javax.media.DurationUpdateEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.DurationUpdateEvent.class.isInterface());
		assertTrue(javax.media.DurationUpdateEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DurationUpdateEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.DurationUpdateEvent.class.getConstructor(new Class[]{javax.media.Controller.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.DurationUpdateEvent o = null;
		o.toString();
		o.getDuration();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.DurationUpdateEvent o = null;
		new javax.media.DurationUpdateEvent((javax.media.Controller) null, (javax.media.Time) null);
		}
	}
	public void test_javax_media_rtp_event_InactiveSendStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.InactiveSendStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.InactiveSendStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.InactiveSendStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.SendStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveSendStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.InactiveSendStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.SendStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.InactiveSendStreamEvent o = null;
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.InactiveSendStreamEvent o = null;
		new javax.media.rtp.event.InactiveSendStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.SendStream) null);
		}
	}
	public void test_javax_media_datasink_DataSinkEvent() throws Exception
	{
		assertEquals(javax.media.datasink.DataSinkEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.datasink.DataSinkEvent.class.isInterface());
		assertTrue(javax.media.datasink.DataSinkEvent.class.getSuperclass().equals(javax.media.MediaEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("getSourceDataSink", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.DataSink.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.datasink.DataSinkEvent.class.getConstructor(new Class[]{javax.media.DataSink.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.datasink.DataSinkEvent.class.getConstructor(new Class[]{javax.media.DataSink.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.datasink.DataSinkEvent o = null;
		o.toString();
		o.getSourceDataSink();
		o.getSource();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.datasink.DataSinkEvent o = null;
		new javax.media.datasink.DataSinkEvent((javax.media.DataSink) null);
		new javax.media.datasink.DataSinkEvent((javax.media.DataSink) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_ClockStartedError() throws Exception
	{
		assertEquals(javax.media.ClockStartedError.class.getModifiers(), 1);
		assertTrue(!javax.media.ClockStartedError.class.isInterface());
		assertTrue(javax.media.ClockStartedError.class.getSuperclass().equals(javax.media.MediaError.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStartedError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ClockStartedError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ClockStartedError.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ClockStartedError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ClockStartedError o = null;
		new javax.media.ClockStartedError((java.lang.String) null);
		new javax.media.ClockStartedError();
		}
	}
	public void test_javax_media_format_VideoFormat() throws Exception
	{
		assertEquals(javax.media.format.VideoFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.VideoFormat.class.isInterface());
		assertTrue(javax.media.format.VideoFormat.class.getSuperclass().equals(javax.media.Format.class));
		// Static fields: 
		assertTrue(javax.media.format.VideoFormat.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.VideoFormat.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.VideoFormat.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.VideoFormat.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.VideoFormat.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.VideoFormat.H261.equals("h261"));
		assertTrue(javax.media.format.VideoFormat.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.VideoFormat.H263.equals("h263"));
		assertTrue(javax.media.format.VideoFormat.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.VideoFormat.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.VideoFormat.RGB.equals("rgb"));
		assertTrue(javax.media.format.VideoFormat.YUV.equals("yuv"));
		assertTrue(javax.media.format.VideoFormat.IRGB.equals("irgb"));
		assertTrue(javax.media.format.VideoFormat.SMC.equals("smc"));
		assertTrue(javax.media.format.VideoFormat.RLE.equals("rle"));
		assertTrue(javax.media.format.VideoFormat.RPZA.equals("rpza"));
		assertTrue(javax.media.format.VideoFormat.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.VideoFormat.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.VideoFormat.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.VideoFormat.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.VideoFormat.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.VideoFormat.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.VideoFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.VideoFormat.TRUE == 1);
		assertTrue(javax.media.format.VideoFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.VideoFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.VideoFormat.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.VideoFormat.class.getConstructor(new Class[]{java.lang.String.class, java.awt.Dimension.class, int.class, java.lang.Class.class, float.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("size");
			assertEquals(f.getType().getName(), "java.awt.Dimension");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("maxDataLength");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("frameRate");
			assertEquals(f.getType().getName(), "float");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("CINEPAK");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("JPEG");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("JPEG_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("MPEG");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("MPEG_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("H261");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("H261_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("H263");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("H263_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("H263_1998_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("RGB");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("YUV");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("IRGB");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("SMC");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("RLE");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("RPZA");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("MJPG");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("MJPEGA");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("MJPEGB");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("INDEO32");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("INDEO41");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.VideoFormat.class.getDeclaredField("INDEO50");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.VideoFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.getSize();
		o.intersects((javax.media.Format) null);
		o.getFrameRate();
		o.relax();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.VideoFormat o = null;
		new javax.media.format.VideoFormat((java.lang.String) null);
		new javax.media.format.VideoFormat((java.lang.String) null, (java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f);
		}
	}
	public void test_javax_media_PackageManager() throws Exception
	{
		assertEquals(javax.media.PackageManager.class.getModifiers(), 1);
		assertTrue(!javax.media.PackageManager.class.isInterface());
		assertTrue(javax.media.PackageManager.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.PackageManager.class.getMethod("getContentPrefixList", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("getProtocolPrefixList", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("setProtocolPrefixList", new Class[]{java.util.Vector.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("commitProtocolPrefixList", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("setContentPrefixList", new Class[]{java.util.Vector.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("commitContentPrefixList", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PackageManager.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.PackageManager.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.PackageManager o = null;
		javax.media.PackageManager.getContentPrefixList();
		javax.media.PackageManager.getProtocolPrefixList();
		javax.media.PackageManager.setProtocolPrefixList((java.util.Vector) null);
		javax.media.PackageManager.commitProtocolPrefixList();
		javax.media.PackageManager.setContentPrefixList((java.util.Vector) null);
		javax.media.PackageManager.commitContentPrefixList();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.PackageManager o = null;
		new javax.media.PackageManager();
		}
	}
	public void test_javax_media_NoDataSourceException() throws Exception
	{
		assertEquals(javax.media.NoDataSourceException.class.getModifiers(), 1);
		assertTrue(!javax.media.NoDataSourceException.class.isInterface());
		assertTrue(javax.media.NoDataSourceException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSourceException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NoDataSourceException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.NoDataSourceException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NoDataSourceException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NoDataSourceException o = null;
		new javax.media.NoDataSourceException();
		new javax.media.NoDataSourceException((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_NewReceiveStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.NewReceiveStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.NewReceiveStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.NewReceiveStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewReceiveStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.NewReceiveStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.ReceiveStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.NewReceiveStreamEvent o = null;
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.NewReceiveStreamEvent o = null;
		new javax.media.rtp.event.NewReceiveStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.ReceiveStream) null);
		}
	}
	public void test_javax_media_AudioDeviceUnavailableEvent() throws Exception
	{
		assertEquals(javax.media.AudioDeviceUnavailableEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.AudioDeviceUnavailableEvent.class.isInterface());
		assertTrue(javax.media.AudioDeviceUnavailableEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.AudioDeviceUnavailableEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.AudioDeviceUnavailableEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.AudioDeviceUnavailableEvent o = null;
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.AudioDeviceUnavailableEvent o = null;
		new javax.media.AudioDeviceUnavailableEvent((javax.media.Controller) null);
		}
	}
	public void test_javax_media_RealizeCompleteEvent() throws Exception
	{
		assertEquals(javax.media.RealizeCompleteEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.RealizeCompleteEvent.class.isInterface());
		assertTrue(javax.media.RealizeCompleteEvent.class.getSuperclass().equals(javax.media.TransitionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RealizeCompleteEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.RealizeCompleteEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.RealizeCompleteEvent o = null;
		o.toString();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.RealizeCompleteEvent o = null;
		new javax.media.RealizeCompleteEvent((javax.media.Controller) null, 0, 0, 0);
		}
	}
	public void test_javax_media_rtp_event_SessionEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.SessionEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.SessionEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.SessionEvent.class.getSuperclass().equals(javax.media.rtp.event.RTPEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SessionEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.SessionEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.SessionEvent o = null;
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.SessionEvent o = null;
		new javax.media.rtp.event.SessionEvent((javax.media.rtp.SessionManager) null);
		}
	}
	public void test_javax_media_rtp_RTPManager() throws Exception
	{
		assertEquals(javax.media.rtp.RTPManager.class.getModifiers(), 1025);
		assertTrue(!javax.media.rtp.RTPManager.class.isInterface());
		assertTrue(javax.media.Controls.class.isAssignableFrom(javax.media.rtp.RTPManager.class));
		assertTrue(javax.media.rtp.RTPManager.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("newInstance", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.RTPManager.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("initialize", new Class[]{javax.media.rtp.SessionAddress.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("initialize", new Class[]{javax.media.rtp.SessionAddress[].class, javax.media.rtp.rtcp.SourceDescription[].class, double.class, double.class, javax.media.rtp.EncryptionInfo.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("initialize", new Class[]{javax.media.rtp.RTPConnector.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("dispose", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addFormat", new Class[]{javax.media.Format.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addReceiveStreamListener", new Class[]{javax.media.rtp.ReceiveStreamListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addRemoteListener", new Class[]{javax.media.rtp.RemoteListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addSendStreamListener", new Class[]{javax.media.rtp.SendStreamListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addSessionListener", new Class[]{javax.media.rtp.SessionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeTarget", new Class[]{javax.media.rtp.SessionAddress.class, java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeTargets", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("createSendStream", new Class[]{javax.media.protocol.DataSource.class, int.class});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getActiveParticipants", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getAllParticipants", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getGlobalReceptionStats", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.GlobalReceptionStats.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getGlobalTransmissionStats", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.GlobalTransmissionStats.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getLocalParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.LocalParticipant.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getPassiveParticipants", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getReceiveStreams", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getRemoteParticipants", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getSendStreams", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("addTarget", new Class[]{javax.media.rtp.SessionAddress.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeReceiveStreamListener", new Class[]{javax.media.rtp.ReceiveStreamListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeRemoteListener", new Class[]{javax.media.rtp.RemoteListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeSendStreamListener", new Class[]{javax.media.rtp.SendStreamListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("removeSessionListener", new Class[]{javax.media.rtp.SessionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getRTPManagerList", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPManager.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.RTPManager.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.RTPManager o = null;
		javax.media.rtp.RTPManager.newInstance();
		o.initialize((javax.media.rtp.SessionAddress) null);
		o.initialize((javax.media.rtp.SessionAddress[]) null, (javax.media.rtp.rtcp.SourceDescription[]) null, 0.0, 0.0, (javax.media.rtp.EncryptionInfo) null);
		o.initialize((javax.media.rtp.RTPConnector) null);
		o.getControls();
		o.getControl((java.lang.String) null);
		o.dispose();
		o.addFormat((javax.media.Format) null, 0);
		o.addReceiveStreamListener((javax.media.rtp.ReceiveStreamListener) null);
		o.addRemoteListener((javax.media.rtp.RemoteListener) null);
		o.addSendStreamListener((javax.media.rtp.SendStreamListener) null);
		o.addSessionListener((javax.media.rtp.SessionListener) null);
		o.removeTarget((javax.media.rtp.SessionAddress) null, (java.lang.String) null);
		o.removeTargets((java.lang.String) null);
		o.createSendStream((javax.media.protocol.DataSource) null, 0);
		o.getActiveParticipants();
		o.getAllParticipants();
		o.getGlobalReceptionStats();
		o.getGlobalTransmissionStats();
		o.getLocalParticipant();
		o.getPassiveParticipants();
		o.getReceiveStreams();
		o.getRemoteParticipants();
		o.getSendStreams();
		o.addTarget((javax.media.rtp.SessionAddress) null);
		o.removeReceiveStreamListener((javax.media.rtp.ReceiveStreamListener) null);
		o.removeRemoteListener((javax.media.rtp.RemoteListener) null);
		o.removeSendStreamListener((javax.media.rtp.SendStreamListener) null);
		o.removeSessionListener((javax.media.rtp.SessionListener) null);
		javax.media.rtp.RTPManager.getRTPManagerList();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_protocol_ContentDescriptor() throws Exception
	{
		assertEquals(javax.media.protocol.ContentDescriptor.class.getModifiers(), 1);
		assertTrue(!javax.media.protocol.ContentDescriptor.class.isInterface());
		assertTrue(javax.media.protocol.ContentDescriptor.class.getSuperclass().equals(javax.media.Format.class));
		// Static fields: 
		assertTrue(javax.media.protocol.ContentDescriptor.RAW.equals("raw"));
		assertTrue(javax.media.protocol.ContentDescriptor.RAW_RTP.equals("raw.rtp"));
		assertTrue(javax.media.protocol.ContentDescriptor.MIXED.equals("application.mixed-data"));
		assertTrue(javax.media.protocol.ContentDescriptor.CONTENT_UNKNOWN.equals("UnknownContent"));
		assertTrue(javax.media.protocol.ContentDescriptor.NOT_SPECIFIED == -1);
		assertTrue(javax.media.protocol.ContentDescriptor.TRUE == 1);
		assertTrue(javax.media.protocol.ContentDescriptor.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("mimeTypeToPackageName", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 25);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.ContentDescriptor.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.ContentDescriptor.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.protocol.ContentDescriptor.class.getDeclaredField("RAW");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.ContentDescriptor.class.getDeclaredField("RAW_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.ContentDescriptor.class.getDeclaredField("MIXED");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.ContentDescriptor.class.getDeclaredField("CONTENT_UNKNOWN");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.ContentDescriptor o = null;
		o.toString();
		o.getContentType();
		javax.media.protocol.ContentDescriptor.mimeTypeToPackageName((java.lang.String) null);
		o.clone();
		o.equals((java.lang.Object) null);
		o.matches((javax.media.Format) null);
		o.getEncoding();
		o.intersects((javax.media.Format) null);
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.relax();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.protocol.ContentDescriptor o = null;
		new javax.media.protocol.ContentDescriptor((java.lang.String) null);
		}
	}
	public void test_javax_media_util_BufferToImage() throws Exception
	{
		assertEquals(javax.media.util.BufferToImage.class.getModifiers(), 1);
		assertTrue(!javax.media.util.BufferToImage.class.isInterface());
//		assertTrue(javax.media.util.BufferToImage.class.getSuperclass().equals(java.lang.Object.class)); // no longer true, we subclass FMJ's in FMJ.
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("createImage", new Class[]{javax.media.Buffer.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.BufferToImage.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.util.BufferToImage.class.getConstructor(new Class[]{javax.media.format.VideoFormat.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.util.BufferToImage o = null;
		o.createImage((javax.media.Buffer) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.util.BufferToImage o = null;
		new javax.media.util.BufferToImage((javax.media.format.VideoFormat) null);
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerVolumePropertyEditor() throws Exception
	{
		assertEquals(javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.isInterface());
		assertTrue(javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getSuperclass().equals(java.beans.PropertyEditorSupport.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getJavaInitializationString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getTags", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getValue", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("setValue", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("setSource", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("addPropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("removePropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("firePropertyChange", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("setAsText", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getAsText", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("isPaintable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("paintValue", new Class[]{java.awt.Graphics.class, java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getCustomEditor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("supportsCustomEditor", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor o = null;
		o.getJavaInitializationString();
		o.getTags();
		o.getValue();
		o.setValue((java.lang.Object) null);
		o.setSource((java.lang.Object) null);
		o.addPropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.removePropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.firePropertyChange();
		o.getSource();
		o.setAsText((java.lang.String) null);
		o.getAsText();
		o.isPaintable();
		o.paintValue((java.awt.Graphics) null, (java.awt.Rectangle) null);
		o.getCustomEditor();
		o.supportsCustomEditor();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor o = null;
		new javax.media.bean.playerbean.MediaPlayerVolumePropertyEditor();
		}
	}
	public void test_javax_media_protocol_RateRange() throws Exception
	{
		assertEquals(javax.media.protocol.RateRange.class.getModifiers(), 1);
		assertTrue(!javax.media.protocol.RateRange.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.protocol.RateRange.class));
		assertTrue(javax.media.protocol.RateRange.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("isExact", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("setCurrentRate", new Class[]{float.class});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("getCurrentRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("getMinimumRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("getMaximumRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("inRange", new Class[]{float.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.RateRange.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.RateRange.class.getConstructor(new Class[]{javax.media.protocol.RateRange.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.protocol.RateRange.class.getConstructor(new Class[]{float.class, float.class, float.class, boolean.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.RateRange o = null;
		o.isExact();
		o.setCurrentRate(0.f);
		o.getCurrentRate();
		o.getMinimumRate();
		o.getMaximumRate();
		o.inRange(0.f);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.protocol.RateRange o = null;
		new javax.media.protocol.RateRange((javax.media.protocol.RateRange) null);
		new javax.media.protocol.RateRange(0.f, 0.f, 0.f, false);
		}
	}
	public void test_javax_media_NotRealizedError() throws Exception
	{
		assertEquals(javax.media.NotRealizedError.class.getModifiers(), 1);
		assertTrue(!javax.media.NotRealizedError.class.isInterface());
		assertTrue(javax.media.NotRealizedError.class.getSuperclass().equals(javax.media.MediaError.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotRealizedError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NotRealizedError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NotRealizedError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NotRealizedError o = null;
		new javax.media.NotRealizedError((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_rtcp_SourceDescription() throws Exception
	{
		if (true)
			return;	// TODO: RTP not properly stubbed or implemented.
		assertEquals(javax.media.rtp.rtcp.SourceDescription.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.rtcp.SourceDescription.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.rtp.rtcp.SourceDescription.class));
		assertTrue(javax.media.rtp.rtcp.SourceDescription.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_CNAME == 1);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_NAME == 2);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_EMAIL == 3);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_PHONE == 4);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_LOC == 5);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_TOOL == 6);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_NOTE == 7);
		assertTrue(javax.media.rtp.rtcp.SourceDescription.SOURCE_DESC_PRIV == 8);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("getType", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("getDescription", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("setDescription", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("getFrequency", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("getEncrypted", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("generateCNAME", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.rtcp.SourceDescription.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.rtcp.SourceDescription.class.getConstructor(new Class[]{int.class, java.lang.String.class, int.class, boolean.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_CNAME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_NAME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_EMAIL");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_PHONE");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_LOC");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_TOOL");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_NOTE");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("SOURCE_DESC_PRIV");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("jmfSecurity");
			assertEquals(f.getType().getName(), "com.sun.media.JMFSecurity");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("securityPrivelege");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("m");
			assertEquals(f.getType().getName(), "[Ljava.lang.reflect.Method;");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("cl");
			assertEquals(f.getType().getName(), "[Ljava.lang.Class;");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("args");
			assertEquals(f.getType().getName(), "[[Ljava.lang.Object;");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("m_type");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("m_description");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("m_frequency");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.rtcp.SourceDescription.class.getDeclaredField("m_encrypted");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.rtcp.SourceDescription o = null;
		o.getType();
		o.getDescription();
		o.setDescription((java.lang.String) null);
		o.getFrequency();
		o.getEncrypted();
		javax.media.rtp.rtcp.SourceDescription.generateCNAME();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.rtcp.SourceDescription o = null;
		new javax.media.rtp.rtcp.SourceDescription(0, (java.lang.String) null, 0, false);
		}
	}
	public void test_javax_media_format_AudioFormat() throws Exception
	{
		assertEquals(javax.media.format.AudioFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.AudioFormat.class.isInterface());
		assertTrue(javax.media.format.AudioFormat.class.getSuperclass().equals(javax.media.Format.class));
		// Static fields: 
		assertTrue(javax.media.format.AudioFormat.BIG_ENDIAN == 1);
		assertTrue(javax.media.format.AudioFormat.LITTLE_ENDIAN == 0);
		assertTrue(javax.media.format.AudioFormat.SIGNED == 1);
		assertTrue(javax.media.format.AudioFormat.UNSIGNED == 0);
		assertTrue(javax.media.format.AudioFormat.LINEAR.equals("LINEAR"));
		assertTrue(javax.media.format.AudioFormat.ULAW.equals("ULAW"));
		assertTrue(javax.media.format.AudioFormat.ULAW_RTP.equals("ULAW/rtp"));
		assertTrue(javax.media.format.AudioFormat.ALAW.equals("alaw"));
		assertTrue(javax.media.format.AudioFormat.IMA4.equals("ima4"));
		assertTrue(javax.media.format.AudioFormat.IMA4_MS.equals("ima4/ms"));
		assertTrue(javax.media.format.AudioFormat.MSADPCM.equals("msadpcm"));
		assertTrue(javax.media.format.AudioFormat.DVI.equals("dvi"));
		assertTrue(javax.media.format.AudioFormat.DVI_RTP.equals("dvi/rtp"));
		assertTrue(javax.media.format.AudioFormat.G723.equals("g723"));
		assertTrue(javax.media.format.AudioFormat.G723_RTP.equals("g723/rtp"));
		assertTrue(javax.media.format.AudioFormat.G728.equals("g728"));
		assertTrue(javax.media.format.AudioFormat.G728_RTP.equals("g728/rtp"));
		assertTrue(javax.media.format.AudioFormat.G729.equals("g729"));
		assertTrue(javax.media.format.AudioFormat.G729_RTP.equals("g729/rtp"));
		assertTrue(javax.media.format.AudioFormat.G729A.equals("g729a"));
		assertTrue(javax.media.format.AudioFormat.G729A_RTP.equals("g729a/rtp"));
		assertTrue(javax.media.format.AudioFormat.GSM.equals("gsm"));
		assertTrue(javax.media.format.AudioFormat.GSM_MS.equals("gsm/ms"));
		assertTrue(javax.media.format.AudioFormat.GSM_RTP.equals("gsm/rtp"));
		assertTrue(javax.media.format.AudioFormat.MAC3.equals("MAC3"));
		assertTrue(javax.media.format.AudioFormat.MAC6.equals("MAC6"));
		assertTrue(javax.media.format.AudioFormat.TRUESPEECH.equals("truespeech"));
		assertTrue(javax.media.format.AudioFormat.MSNAUDIO.equals("msnaudio"));
		assertTrue(javax.media.format.AudioFormat.MPEGLAYER3.equals("mpeglayer3"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREAC8.equals("voxwareac8"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREAC10.equals("voxwareac10"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREAC16.equals("voxwareac16"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREAC20.equals("voxwareac20"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREMETAVOICE.equals("voxwaremetavoice"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREMETASOUND.equals("voxwaremetasound"));
		assertTrue(javax.media.format.AudioFormat.VOXWARERT29H.equals("voxwarert29h"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREVR12.equals("voxwarevr12"));
		assertTrue(javax.media.format.AudioFormat.VOXWAREVR18.equals("voxwarevr18"));
		assertTrue(javax.media.format.AudioFormat.VOXWARETQ40.equals("voxwaretq40"));
		assertTrue(javax.media.format.AudioFormat.VOXWARETQ60.equals("voxwaretq60"));
		assertTrue(javax.media.format.AudioFormat.MSRT24.equals("msrt24"));
		assertTrue(javax.media.format.AudioFormat.MPEG.equals("mpegaudio"));
		assertTrue(javax.media.format.AudioFormat.MPEG_RTP.equals("mpegaudio/rtp"));
		assertTrue(javax.media.format.AudioFormat.DOLBYAC3.equals("dolbyac3"));
		assertTrue(javax.media.format.AudioFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.AudioFormat.TRUE == 1);
		assertTrue(javax.media.format.AudioFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), double.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getSampleRate", new Class[]{});
			assertEquals(m.getReturnType(), double.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getSampleSizeInBits", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getChannels", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getEndian", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getSigned", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getFrameSizeInBits", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("computeDuration", new Class[]{long.class});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.AudioFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.AudioFormat.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.AudioFormat.class.getConstructor(new Class[]{java.lang.String.class, double.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.AudioFormat.class.getConstructor(new Class[]{java.lang.String.class, double.class, int.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.AudioFormat.class.getConstructor(new Class[]{java.lang.String.class, double.class, int.class, int.class, int.class, int.class, int.class, double.class, java.lang.Class.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("BIG_ENDIAN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("LITTLE_ENDIAN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("SIGNED");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("UNSIGNED");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("sampleRate");
			assertEquals(f.getType().getName(), "double");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("sampleSizeInBits");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("channels");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("endian");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("signed");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("frameRate");
			assertEquals(f.getType().getName(), "double");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("frameSizeInBits");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("LINEAR");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("ULAW");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("ULAW_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("ALAW");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("IMA4");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("IMA4_MS");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MSADPCM");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("DVI");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("DVI_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G723");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G723_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G728");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G728_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G729");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G729_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G729A");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("G729A_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("GSM");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("GSM_MS");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("GSM_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MAC3");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MAC6");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("TRUESPEECH");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MSNAUDIO");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MPEGLAYER3");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREAC8");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREAC10");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREAC16");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREAC20");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREMETAVOICE");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREMETASOUND");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWARERT29H");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREVR12");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWAREVR18");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWARETQ40");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("VOXWARETQ60");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MSRT24");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MPEG");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("MPEG_RTP");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("DOLBYAC3");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("multiplier");
			assertEquals(f.getType().getName(), "double");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("margin");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.format.AudioFormat.class.getDeclaredField("init");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 0);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.AudioFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.getFrameRate();
		o.getSampleRate();
		o.getSampleSizeInBits();
		o.getChannels();
		o.getEndian();
		o.getSigned();
		o.getFrameSizeInBits();
		o.computeDuration(0L);
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.relax();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.AudioFormat o = null;
		new javax.media.format.AudioFormat((java.lang.String) null);
		new javax.media.format.AudioFormat((java.lang.String) null, 0.0, 0, 0);
		new javax.media.format.AudioFormat((java.lang.String) null, 0.0, 0, 0, 0, 0);
		new javax.media.format.AudioFormat((java.lang.String) null, 0.0, 0, 0, 0, 0, 0, 0.0, (java.lang.Class) null);
		}
	}
	public void test_javax_media_rtp_event_ActiveReceiveStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ActiveReceiveStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ActiveReceiveStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ActiveReceiveStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ActiveReceiveStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.ReceiveStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ActiveReceiveStreamEvent o = null;
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ActiveReceiveStreamEvent o = null;
		new javax.media.rtp.event.ActiveReceiveStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.ReceiveStream) null);
		}
	}
	public void test_javax_media_rtp_event_LocalCollisionEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.LocalCollisionEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.LocalCollisionEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.LocalCollisionEvent.class.getSuperclass().equals(javax.media.rtp.event.SessionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("getNewSSRC", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalCollisionEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.LocalCollisionEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.ReceiveStream.class, long.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.LocalCollisionEvent o = null;
		o.getReceiveStream();
		o.getNewSSRC();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.LocalCollisionEvent o = null;
		new javax.media.rtp.event.LocalCollisionEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.ReceiveStream) null, 0L);
		}
	}
	public void test_javax_media_NoPlayerException() throws Exception
	{
		assertEquals(javax.media.NoPlayerException.class.getModifiers(), 1);
		assertTrue(!javax.media.NoPlayerException.class.isInterface());
		assertTrue(javax.media.NoPlayerException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoPlayerException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NoPlayerException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.NoPlayerException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NoPlayerException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NoPlayerException o = null;
		new javax.media.NoPlayerException();
		new javax.media.NoPlayerException((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_StreamMappedEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.StreamMappedEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.StreamMappedEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.StreamMappedEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamMappedEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.StreamMappedEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.ReceiveStream.class, javax.media.rtp.Participant.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.StreamMappedEvent o = null;
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.StreamMappedEvent o = null;
		new javax.media.rtp.event.StreamMappedEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.ReceiveStream) null, (javax.media.rtp.Participant) null);
		}
	}
	public void test_javax_media_ProcessorModel() throws Exception
	{
		assertEquals(javax.media.ProcessorModel.class.getModifiers(), 1);
		assertTrue(!javax.media.ProcessorModel.class.isInterface());
		assertTrue(javax.media.ProcessorModel.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getContentDescriptor", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.ContentDescriptor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getInputDataSource", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.DataSource.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getInputLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getTrackCount", new Class[]{int.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getOutputTrackFormat", new Class[]{int.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("isFormatAcceptable", new Class[]{int.class, javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ProcessorModel.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ProcessorModel.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ProcessorModel.class.getConstructor(new Class[]{javax.media.Format[].class, javax.media.protocol.ContentDescriptor.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ProcessorModel.class.getConstructor(new Class[]{javax.media.protocol.DataSource.class, javax.media.Format[].class, javax.media.protocol.ContentDescriptor.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ProcessorModel.class.getConstructor(new Class[]{javax.media.MediaLocator.class, javax.media.Format[].class, javax.media.protocol.ContentDescriptor.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ProcessorModel o = null;
		o.getContentDescriptor();
		o.getInputDataSource();
		o.getInputLocator();
		o.getTrackCount(0);
		o.getOutputTrackFormat(0);
		o.isFormatAcceptable(0, (javax.media.Format) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ProcessorModel o = null;
		new javax.media.ProcessorModel();
		new javax.media.ProcessorModel((javax.media.Format[]) null, (javax.media.protocol.ContentDescriptor) null);
		new javax.media.ProcessorModel((javax.media.protocol.DataSource) null, (javax.media.Format[]) null, (javax.media.protocol.ContentDescriptor) null);
		new javax.media.ProcessorModel((javax.media.MediaLocator) null, (javax.media.Format[]) null, (javax.media.protocol.ContentDescriptor) null);
		}
	}
	public void test_javax_media_StopTimeChangeEvent() throws Exception
	{
		assertEquals(javax.media.StopTimeChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.StopTimeChangeEvent.class.isInterface());
		assertTrue(javax.media.StopTimeChangeEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("getStopTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StopTimeChangeEvent.class.getConstructor(new Class[]{javax.media.Controller.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StopTimeChangeEvent o = null;
		o.toString();
		o.getStopTime();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StopTimeChangeEvent o = null;
		new javax.media.StopTimeChangeEvent((javax.media.Controller) null, (javax.media.Time) null);
		}
	}
	public void test_javax_media_rtp_SessionManagerException() throws Exception
	{
		assertEquals(javax.media.rtp.SessionManagerException.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.SessionManagerException.class.isInterface());
		assertTrue(javax.media.rtp.SessionManagerException.class.getSuperclass().equals(java.lang.Exception.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionManagerException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.SessionManagerException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.SessionManagerException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.SessionManagerException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.SessionManagerException o = null;
		new javax.media.rtp.SessionManagerException();
		new javax.media.rtp.SessionManagerException((java.lang.String) null);
		}
	}
	public void test_javax_media_NoProcessorException() throws Exception
	{
		assertEquals(javax.media.NoProcessorException.class.getModifiers(), 1);
		assertTrue(!javax.media.NoProcessorException.class.isInterface());
		assertTrue(javax.media.NoProcessorException.class.getSuperclass().equals(javax.media.NoPlayerException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoProcessorException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NoProcessorException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.NoProcessorException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NoProcessorException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NoProcessorException o = null;
		new javax.media.NoProcessorException();
		new javax.media.NoProcessorException((java.lang.String) null);
		}
	}
	public void test_javax_media_datasink_DataSinkErrorEvent() throws Exception
	{
		assertEquals(javax.media.datasink.DataSinkErrorEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.datasink.DataSinkErrorEvent.class.isInterface());
		assertTrue(javax.media.datasink.DataSinkErrorEvent.class.getSuperclass().equals(javax.media.datasink.DataSinkEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("getSourceDataSink", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.DataSink.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.DataSinkErrorEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.datasink.DataSinkErrorEvent.class.getConstructor(new Class[]{javax.media.DataSink.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.datasink.DataSinkErrorEvent.class.getConstructor(new Class[]{javax.media.DataSink.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.datasink.DataSinkErrorEvent o = null;
		o.toString();
		o.getSourceDataSink();
		o.getSource();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.datasink.DataSinkErrorEvent o = null;
		new javax.media.datasink.DataSinkErrorEvent((javax.media.DataSink) null);
		new javax.media.datasink.DataSinkErrorEvent((javax.media.DataSink) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_StreamClosedEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.StreamClosedEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.StreamClosedEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.StreamClosedEvent.class.getSuperclass().equals(javax.media.rtp.event.SendStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.StreamClosedEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.StreamClosedEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.SendStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.StreamClosedEvent o = null;
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.StreamClosedEvent o = null;
		new javax.media.rtp.event.StreamClosedEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.SendStream) null);
		}
	}
	public void test_javax_media_ConfigureCompleteEvent() throws Exception
	{
		assertEquals(javax.media.ConfigureCompleteEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ConfigureCompleteEvent.class.isInterface());
		assertTrue(javax.media.ConfigureCompleteEvent.class.getSuperclass().equals(javax.media.TransitionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConfigureCompleteEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ConfigureCompleteEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ConfigureCompleteEvent o = null;
		o.toString();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ConfigureCompleteEvent o = null;
		new javax.media.ConfigureCompleteEvent((javax.media.Controller) null, 0, 0, 0);
		}
	}
	public void test_javax_media_DataLostErrorEvent() throws Exception
	{
		assertEquals(javax.media.DataLostErrorEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.DataLostErrorEvent.class.isInterface());
		assertTrue(javax.media.DataLostErrorEvent.class.getSuperclass().equals(javax.media.ControllerClosedEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataLostErrorEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.DataLostErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.DataLostErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.DataLostErrorEvent o = null;
		o.getMessage();
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.DataLostErrorEvent o = null;
		new javax.media.DataLostErrorEvent((javax.media.Controller) null);
		new javax.media.DataLostErrorEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_Buffer() throws Exception
	{
		assertEquals(javax.media.Buffer.class.getModifiers(), 1);
		assertTrue(!javax.media.Buffer.class.isInterface());
		assertTrue(javax.media.Buffer.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.Buffer.FLAG_EOM == 1);
		assertTrue(javax.media.Buffer.FLAG_DISCARD == 2);
		assertTrue(javax.media.Buffer.FLAG_SILENCE == 4);
		assertTrue(javax.media.Buffer.FLAG_SID == 8);
		assertTrue(javax.media.Buffer.FLAG_KEY_FRAME == 16);
		assertTrue(javax.media.Buffer.FLAG_NO_DROP == 32);
		assertTrue(javax.media.Buffer.FLAG_NO_WAIT == 64);
		assertTrue(javax.media.Buffer.FLAG_NO_SYNC == 96);
		assertTrue(javax.media.Buffer.FLAG_SYSTEM_TIME == 128);
		assertTrue(javax.media.Buffer.FLAG_RELATIVE_TIME == 256);
		assertTrue(javax.media.Buffer.FLAG_FLUSH == 512);
		assertTrue(javax.media.Buffer.FLAG_SYSTEM_MARKER == 1024);
		assertTrue(javax.media.Buffer.FLAG_RTP_MARKER == 2048);
		assertTrue(javax.media.Buffer.FLAG_RTP_TIME == 4096);
		assertTrue(javax.media.Buffer.FLAG_BUF_OVERFLOWN == 8192);
		assertTrue(javax.media.Buffer.FLAG_BUF_UNDERFLOWN == 16384);
		assertTrue(javax.media.Buffer.FLAG_LIVE_DATA == 32768);
		assertTrue(javax.media.Buffer.TIME_UNKNOWN == -1L);
		assertTrue(javax.media.Buffer.SEQUENCE_UNKNOWN == 9223372036854775806L);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.Buffer.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("copy", new Class[]{javax.media.Buffer.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("copy", new Class[]{javax.media.Buffer.class, boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setLength", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getOffset", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setOffset", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setFormat", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getFlags", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setFlags", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("isEOM", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setEOM", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("isDiscard", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setDiscard", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getData", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setData", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getHeader", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setHeader", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getTimeStamp", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setTimeStamp", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setDuration", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("setSequenceNumber", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getSequenceNumber", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Buffer.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.Buffer.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_EOM");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_DISCARD");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_SILENCE");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_SID");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_KEY_FRAME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_NO_DROP");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_NO_WAIT");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_NO_SYNC");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_SYSTEM_TIME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_RELATIVE_TIME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_FLUSH");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_SYSTEM_MARKER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_RTP_MARKER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_RTP_TIME");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_BUF_OVERFLOWN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_BUF_UNDERFLOWN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("FLAG_LIVE_DATA");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("TIME_UNKNOWN");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Buffer.class.getDeclaredField("SEQUENCE_UNKNOWN");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.Buffer o = null;
		o.clone();
		o.copy((javax.media.Buffer) null);
		o.copy((javax.media.Buffer) null, false);
		o.setLength(0);
		o.getOffset();
		o.setOffset(0);
		o.getLength();
		o.getFormat();
		o.setFormat((javax.media.Format) null);
		o.getFlags();
		o.setFlags(0);
		o.isEOM();
		o.setEOM(false);
		o.isDiscard();
		o.setDiscard(false);
		o.getData();
		o.setData((java.lang.Object) null);
		o.getHeader();
		o.setHeader((java.lang.Object) null);
		o.getTimeStamp();
		o.setTimeStamp(0L);
		o.getDuration();
		o.setDuration(0L);
		o.setSequenceNumber(0L);
		o.getSequenceNumber();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.Buffer o = null;
		new javax.media.Buffer();
		}
	}
	public void test_javax_media_MediaLocator() throws Exception
	{
		assertEquals(javax.media.MediaLocator.class.getModifiers(), 1);
		assertTrue(!javax.media.MediaLocator.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.MediaLocator.class));
		assertTrue(javax.media.MediaLocator.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.MediaLocator.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("getURL", new Class[]{});
			assertEquals(m.getReturnType(), java.net.URL.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("getProtocol", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("toExternalForm", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("getRemainder", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaLocator.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.MediaLocator.class.getConstructor(new Class[]{java.net.URL.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.MediaLocator.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.MediaLocator o = null;
		o.toString();
		o.getURL();
		o.getProtocol();
		o.toExternalForm();
		o.getRemainder();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.MediaLocator o = null;
		new javax.media.MediaLocator((java.net.URL) null);
		new javax.media.MediaLocator((java.lang.String) null);
		}
	}
	public void test_javax_media_protocol_PullBufferDataSource() throws Exception
	{
		assertEquals(javax.media.protocol.PullBufferDataSource.class.getModifiers(), 1025);
		assertTrue(!javax.media.protocol.PullBufferDataSource.class.isInterface());
		assertTrue(javax.media.protocol.PullBufferDataSource.class.getSuperclass().equals(javax.media.protocol.DataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PullBufferStream[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullBufferDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.PullBufferDataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.PullBufferDataSource o = null;
		o.getStreams();
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getLocator();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.setLocator((javax.media.MediaLocator) null);
		o.disconnect();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerBeanInfo() throws Exception
	{
		assertEquals(javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerBeanInfo.class.isInterface());
		assertTrue(javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getSuperclass().equals(java.beans.SimpleBeanInfo.class));
		// Static fields: 
		assertTrue(javax.media.bean.playerbean.MediaPlayerBeanInfo.ICON_COLOR_16x16 == 1);
		assertTrue(javax.media.bean.playerbean.MediaPlayerBeanInfo.ICON_COLOR_32x32 == 2);
		assertTrue(javax.media.bean.playerbean.MediaPlayerBeanInfo.ICON_MONO_16x16 == 3);
		assertTrue(javax.media.bean.playerbean.MediaPlayerBeanInfo.ICON_MONO_32x32 == 4);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getPropertyDescriptors", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.PropertyDescriptor[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getDefaultPropertyIndex", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getBeanDescriptor", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.BeanDescriptor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getEventSetDescriptors", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.EventSetDescriptor[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getIcon", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("loadImage", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getAdditionalBeanInfo", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.BeanInfo[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getDefaultEventIndex", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getMethodDescriptors", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.MethodDescriptor[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerBeanInfo.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerBeanInfo o = null;
		o.getPropertyDescriptors();
		o.getDefaultPropertyIndex();
		o.getBeanDescriptor();
		o.getEventSetDescriptors();
		o.getIcon(0);
		o.loadImage((java.lang.String) null);
		o.getAdditionalBeanInfo();
		o.getDefaultEventIndex();
		o.getMethodDescriptors();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerBeanInfo o = null;
		new javax.media.bean.playerbean.MediaPlayerBeanInfo();
		}
	}
	public void test_javax_media_rtp_event_InactiveReceiveStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.InactiveReceiveStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.InactiveReceiveStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.InactiveReceiveStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("isLastStream", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.InactiveReceiveStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.ReceiveStream.class, boolean.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.InactiveReceiveStreamEvent o = null;
		o.isLastStream();
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.InactiveReceiveStreamEvent o = null;
		new javax.media.rtp.event.InactiveReceiveStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.ReceiveStream) null, false);
		}
	}
	public void test_javax_media_rtp_event_ActiveSendStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ActiveSendStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ActiveSendStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ActiveSendStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.SendStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ActiveSendStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ActiveSendStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.SendStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ActiveSendStreamEvent o = null;
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ActiveSendStreamEvent o = null;
		new javax.media.rtp.event.ActiveSendStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.SendStream) null);
		}
	}
	public void test_javax_media_rtp_RTPHeader() throws Exception
	{
//		if (true)
//			return;	// TODO: RTP not properly stubbed or implemented.

		assertEquals(javax.media.rtp.RTPHeader.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.RTPHeader.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.rtp.RTPHeader.class));
		assertTrue(javax.media.rtp.RTPHeader.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.rtp.RTPHeader.VALUE_NOT_SET == -1);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("isExtensionPresent", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("getExtensionType", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("getExtension", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("setExtensionPresent", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("setExtensionType", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("setExtension", new Class[]{byte[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPHeader.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.RTPHeader.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.RTPHeader.class.getConstructor(new Class[]{int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.RTPHeader.class.getConstructor(new Class[]{boolean.class, int.class, byte[].class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.rtp.RTPHeader.class.getDeclaredField("VALUE_NOT_SET");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.RTPHeader.class.getDeclaredField("extensionPresent");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.RTPHeader.class.getDeclaredField("extensionType");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.RTPHeader.class.getDeclaredField("extension");
			assertEquals(f.getType().getName(), "[B");
			assertEquals(f.getModifiers(), 2);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.RTPHeader o = null;
		o.isExtensionPresent();
		o.getExtensionType();
		o.getExtension();
		o.setExtensionPresent(false);
		o.setExtensionType(0);
		o.setExtension((byte[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.RTPHeader o = null;
		new javax.media.rtp.RTPHeader();
		new javax.media.rtp.RTPHeader(0);
		new javax.media.rtp.RTPHeader(false, 0, (byte[]) null);
		}
	}
	public void test_javax_media_StartEvent() throws Exception
	{
		assertEquals(javax.media.StartEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.StartEvent.class.isInterface());
		assertTrue(javax.media.StartEvent.class.getSuperclass().equals(javax.media.TransitionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StartEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getTimeBaseTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StartEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StartEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StartEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTimeBaseTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StartEvent o = null;
		new javax.media.StartEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null, (javax.media.Time) null);
		}
	}
	public void test_javax_media_rtp_SSRCInUseException() throws Exception
	{
		assertEquals(javax.media.rtp.SSRCInUseException.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.SSRCInUseException.class.isInterface());
		assertTrue(javax.media.rtp.SSRCInUseException.class.getSuperclass().equals(javax.media.rtp.SessionManagerException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SSRCInUseException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.SSRCInUseException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.SSRCInUseException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.SSRCInUseException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.SSRCInUseException o = null;
		new javax.media.rtp.SSRCInUseException();
		new javax.media.rtp.SSRCInUseException((java.lang.String) null);
		}
	}
	public void test_javax_media_protocol_FileTypeDescriptor() throws Exception
	{
		assertEquals(javax.media.protocol.FileTypeDescriptor.class.getModifiers(), 1);
		assertTrue(!javax.media.protocol.FileTypeDescriptor.class.isInterface());
		assertTrue(javax.media.protocol.FileTypeDescriptor.class.getSuperclass().equals(javax.media.protocol.ContentDescriptor.class));
		// Static fields: 
		assertTrue(javax.media.protocol.FileTypeDescriptor.QUICKTIME.equals("video.quicktime"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.MSVIDEO.equals("video.x_msvideo"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.MPEG.equals("video.mpeg"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.VIVO.equals("video.vivo"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.BASIC_AUDIO.equals("audio.basic"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.WAVE.equals("audio.x_wav"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.AIFF.equals("audio.x_aiff"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.MIDI.equals("audio.midi"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.RMF.equals("audio.rmf"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.GSM.equals("audio.x_gsm"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.MPEG_AUDIO.equals("audio.mpeg"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.RAW.equals("raw"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.RAW_RTP.equals("raw.rtp"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.MIXED.equals("application.mixed-data"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.CONTENT_UNKNOWN.equals("UnknownContent"));
		assertTrue(javax.media.protocol.FileTypeDescriptor.NOT_SPECIFIED == -1);
		assertTrue(javax.media.protocol.FileTypeDescriptor.TRUE == 1);
		assertTrue(javax.media.protocol.FileTypeDescriptor.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("mimeTypeToPackageName", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 25);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.FileTypeDescriptor.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.FileTypeDescriptor.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("QUICKTIME");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("MSVIDEO");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("MPEG");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("VIVO");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("BASIC_AUDIO");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("WAVE");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("AIFF");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("MIDI");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("RMF");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("GSM");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.protocol.FileTypeDescriptor.class.getDeclaredField("MPEG_AUDIO");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.FileTypeDescriptor o = null;
		o.toString();
		o.getContentType();
		javax.media.protocol.FileTypeDescriptor.mimeTypeToPackageName((java.lang.String) null);
		o.clone();
		o.equals((java.lang.Object) null);
		o.matches((javax.media.Format) null);
		o.getEncoding();
		o.intersects((javax.media.Format) null);
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.relax();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.protocol.FileTypeDescriptor o = null;
		new javax.media.protocol.FileTypeDescriptor((java.lang.String) null);
		}
	}
	public void test_javax_media_NotConfiguredError() throws Exception
	{
		assertEquals(javax.media.NotConfiguredError.class.getModifiers(), 1);
		assertTrue(!javax.media.NotConfiguredError.class.isInterface());
		assertTrue(javax.media.NotConfiguredError.class.getSuperclass().equals(javax.media.MediaError.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotConfiguredError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NotConfiguredError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NotConfiguredError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NotConfiguredError o = null;
		new javax.media.NotConfiguredError((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_ByeEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ByeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ByeEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ByeEvent.class.getSuperclass().equals(javax.media.rtp.event.TimeoutEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getReason", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("participantLeaving", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ByeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ByeEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.ReceiveStream.class, java.lang.String.class, boolean.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ByeEvent o = null;
		o.getReason();
		o.participantLeaving();
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ByeEvent o = null;
		new javax.media.rtp.event.ByeEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.ReceiveStream) null, (java.lang.String) null, false);
		}
	}
	public void test_javax_media_DeallocateEvent() throws Exception
	{
		assertEquals(javax.media.DeallocateEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.DeallocateEvent.class.isInterface());
		assertTrue(javax.media.DeallocateEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DeallocateEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.DeallocateEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.DeallocateEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.DeallocateEvent o = null;
		new javax.media.DeallocateEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_rtp_EncryptionInfo() throws Exception
	{
		assertEquals(javax.media.rtp.EncryptionInfo.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.EncryptionInfo.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.rtp.EncryptionInfo.class));
		assertTrue(javax.media.rtp.EncryptionInfo.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.rtp.EncryptionInfo.NO_ENCRYPTION == 0);
		assertTrue(javax.media.rtp.EncryptionInfo.XOR == 1);
		assertTrue(javax.media.rtp.EncryptionInfo.MD5 == 2);
		assertTrue(javax.media.rtp.EncryptionInfo.DES == 3);
		assertTrue(javax.media.rtp.EncryptionInfo.TRIPLE_DES == 4);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("getKey", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("getType", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.EncryptionInfo.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.EncryptionInfo.class.getConstructor(new Class[]{int.class, byte[].class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("key");
			assertEquals(f.getType().getName(), "[B");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("type");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("NO_ENCRYPTION");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("XOR");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("MD5");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("DES");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.rtp.EncryptionInfo.class.getDeclaredField("TRIPLE_DES");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.EncryptionInfo o = null;
		o.getKey();
		o.getType();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.EncryptionInfo o = null;
		new javax.media.rtp.EncryptionInfo(0, (byte[]) null);
		}
	}
	public void test_javax_media_ControllerEvent() throws Exception
	{
		assertEquals(javax.media.ControllerEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ControllerEvent.class.isInterface());
		assertTrue(javax.media.ControllerEvent.class.getSuperclass().equals(javax.media.MediaEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ControllerEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ControllerEvent o = null;
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ControllerEvent o = null;
		new javax.media.ControllerEvent((javax.media.Controller) null);
		}
	}
	public void test_javax_media_format_FormatChangeEvent() throws Exception
	{
		assertEquals(javax.media.format.FormatChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.format.FormatChangeEvent.class.isInterface());
		assertTrue(javax.media.format.FormatChangeEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("getOldFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("getNewFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.FormatChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.FormatChangeEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.FormatChangeEvent.class.getConstructor(new Class[]{javax.media.Controller.class, javax.media.Format.class, javax.media.Format.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.FormatChangeEvent o = null;
		o.getOldFormat();
		o.getNewFormat();
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.FormatChangeEvent o = null;
		new javax.media.format.FormatChangeEvent((javax.media.Controller) null);
		new javax.media.format.FormatChangeEvent((javax.media.Controller) null, (javax.media.Format) null, (javax.media.Format) null);
		}
	}
	public void test_javax_media_MediaException() throws Exception
	{
		assertEquals(javax.media.MediaException.class.getModifiers(), 1);
		assertTrue(!javax.media.MediaException.class.isInterface());
		assertTrue(javax.media.MediaException.class.getSuperclass().equals(java.lang.Exception.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.MediaException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.MediaException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.MediaException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.MediaException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.MediaException o = null;
		new javax.media.MediaException();
		new javax.media.MediaException((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_RTPEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.RTPEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.RTPEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.RTPEvent.class.getSuperclass().equals(javax.media.MediaEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RTPEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.RTPEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.RTPEvent o = null;
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.RTPEvent o = null;
		new javax.media.rtp.event.RTPEvent((javax.media.rtp.SessionManager) null);
		}
	}
	public void test_javax_media_format_H263Format() throws Exception
	{
		assertEquals(javax.media.format.H263Format.class.getModifiers(), 1);
		assertTrue(!javax.media.format.H263Format.class.isInterface());
		assertTrue(javax.media.format.H263Format.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.H263Format.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.H263Format.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.H263Format.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.H263Format.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.H263Format.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.H263Format.H261.equals("h261"));
		assertTrue(javax.media.format.H263Format.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.H263Format.H263.equals("h263"));
		assertTrue(javax.media.format.H263Format.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.H263Format.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.H263Format.RGB.equals("rgb"));
		assertTrue(javax.media.format.H263Format.YUV.equals("yuv"));
		assertTrue(javax.media.format.H263Format.IRGB.equals("irgb"));
		assertTrue(javax.media.format.H263Format.SMC.equals("smc"));
		assertTrue(javax.media.format.H263Format.RLE.equals("rle"));
		assertTrue(javax.media.format.H263Format.RPZA.equals("rpza"));
		assertTrue(javax.media.format.H263Format.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.H263Format.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.H263Format.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.H263Format.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.H263Format.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.H263Format.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.H263Format.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.H263Format.TRUE == 1);
		assertTrue(javax.media.format.H263Format.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.H263Format.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getAdvancedPrediction", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getArithmeticCoding", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getErrorCompensation", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getHrDB", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getPBFrames", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getUnrestrictedVector", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H263Format.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.H263Format.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.H263Format.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("ENCODING");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 10);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("advancedPrediction");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("arithmeticCoding");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("errorCompensation");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("hrDB");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("pbFrames");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H263Format.class.getDeclaredField("unrestrictedVector");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.H263Format o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.getAdvancedPrediction();
		o.getArithmeticCoding();
		o.getErrorCompensation();
		o.getHrDB();
		o.getPBFrames();
		o.getUnrestrictedVector();
		o.getSize();
		o.getFrameRate();
		o.relax();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.H263Format o = null;
		new javax.media.format.H263Format();
		new javax.media.format.H263Format((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0, 0, 0, 0, 0);
		}
	}
	public void test_javax_media_rtp_RTPPushDataSource() throws Exception
	{
		assertEquals(javax.media.rtp.RTPPushDataSource.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.RTPPushDataSource.class.isInterface());
		assertTrue(javax.media.rtp.RTPPushDataSource.class.getSuperclass().equals(javax.media.protocol.PushDataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getInputStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.OutputDataStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("setContentType", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getOutputStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushSourceStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushSourceStream[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("setChild", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("setOutputStream", new Class[]{javax.media.protocol.PushSourceStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("setInputStream", new Class[]{javax.media.rtp.OutputDataStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("isStarted", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPPushDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.RTPPushDataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.RTPPushDataSource o = null;
		o.start();
		o.stop();
		o.getInputStream();
		o.connect();
		o.getContentType();
		o.setContentType((java.lang.String) null);
		o.getOutputStream();
		o.getDuration();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.disconnect();
		o.getStreams();
		o.setChild((javax.media.protocol.DataSource) null);
		o.setOutputStream((javax.media.protocol.PushSourceStream) null);
		o.setInputStream((javax.media.rtp.OutputDataStream) null);
		o.isStarted();
		o.getLocator();
		o.setLocator((javax.media.MediaLocator) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.RTPPushDataSource o = null;
		new javax.media.rtp.RTPPushDataSource();
		}
	}
	public void test_javax_media_datasink_EndOfStreamEvent() throws Exception
	{
		assertEquals(javax.media.datasink.EndOfStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.datasink.EndOfStreamEvent.class.isInterface());
		assertTrue(javax.media.datasink.EndOfStreamEvent.class.getSuperclass().equals(javax.media.datasink.DataSinkEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("getSourceDataSink", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.DataSink.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.datasink.EndOfStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.datasink.EndOfStreamEvent.class.getConstructor(new Class[]{javax.media.DataSink.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.datasink.EndOfStreamEvent.class.getConstructor(new Class[]{javax.media.DataSink.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.datasink.EndOfStreamEvent o = null;
		o.toString();
		o.getSourceDataSink();
		o.getSource();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.datasink.EndOfStreamEvent o = null;
		new javax.media.datasink.EndOfStreamEvent((javax.media.DataSink) null);
		new javax.media.datasink.EndOfStreamEvent((javax.media.DataSink) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_StopTimeSetError() throws Exception
	{
		assertEquals(javax.media.StopTimeSetError.class.getModifiers(), 1);
		assertTrue(!javax.media.StopTimeSetError.class.isInterface());
		assertTrue(javax.media.StopTimeSetError.class.getSuperclass().equals(javax.media.MediaError.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopTimeSetError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StopTimeSetError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StopTimeSetError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StopTimeSetError o = null;
		new javax.media.StopTimeSetError((java.lang.String) null);
		}
	}
	public void test_javax_media_protocol_PullDataSource() throws Exception
	{
		assertEquals(javax.media.protocol.PullDataSource.class.getModifiers(), 1025);
		assertTrue(!javax.media.protocol.PullDataSource.class.isInterface());
		assertTrue(javax.media.protocol.PullDataSource.class.getSuperclass().equals(javax.media.protocol.DataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PullSourceStream[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PullDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.PullDataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.PullDataSource o = null;
		o.getStreams();
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getLocator();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.setLocator((javax.media.MediaLocator) null);
		o.disconnect();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_Manager() throws Exception
	{
		assertEquals(javax.media.Manager.class.getModifiers(), 17);
		assertTrue(!javax.media.Manager.class.isInterface());
		assertTrue(javax.media.Manager.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.Manager.MAX_SECURITY == 1);
		assertTrue(javax.media.Manager.CACHING == 2);
		assertTrue(javax.media.Manager.LIGHTWEIGHT_RENDERER == 3);
		assertTrue(javax.media.Manager.PLUGIN_PLAYER == 4);
		assertTrue(javax.media.Manager.UNKNOWN_CONTENT_NAME.equals("unknown"));

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.Manager.class.getMethod("getVersion", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createPlayer", new Class[]{java.net.URL.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createPlayer", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createPlayer", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createRealizedPlayer", new Class[]{java.net.URL.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createRealizedPlayer", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createRealizedPlayer", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createProcessor", new Class[]{java.net.URL.class});
			assertEquals(m.getReturnType(), javax.media.Processor.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createProcessor", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), javax.media.Processor.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createProcessor", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), javax.media.Processor.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createRealizedProcessor", new Class[]{javax.media.ProcessorModel.class});
			assertEquals(m.getReturnType(), javax.media.Processor.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createDataSource", new Class[]{java.net.URL.class});
			assertEquals(m.getReturnType(), javax.media.protocol.DataSource.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createDataSource", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), javax.media.protocol.DataSource.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createMergingDataSource", new Class[]{javax.media.protocol.DataSource[].class});
			assertEquals(m.getReturnType(), javax.media.protocol.DataSource.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createCloneableDataSource", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), javax.media.protocol.DataSource.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getSystemTimeBase", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.TimeBase.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("createDataSink", new Class[]{javax.media.protocol.DataSource.class, javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), javax.media.DataSink.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getCacheDirectory", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("setHint", new Class[]{int.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getHint", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getDataSourceList", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getHandlerClassList", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getProcessorClassList", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Manager.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.Manager.class.getDeclaredField("MAX_SECURITY");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Manager.class.getDeclaredField("CACHING");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Manager.class.getDeclaredField("LIGHTWEIGHT_RENDERER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Manager.class.getDeclaredField("PLUGIN_PLAYER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Manager.class.getDeclaredField("UNKNOWN_CONTENT_NAME");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.Manager o = null;
		javax.media.Manager.getVersion();
		javax.media.Manager.createPlayer((java.net.URL) null);
		javax.media.Manager.createPlayer((javax.media.MediaLocator) null);
		javax.media.Manager.createPlayer((javax.media.protocol.DataSource) null);
		javax.media.Manager.createRealizedPlayer((java.net.URL) null);
		javax.media.Manager.createRealizedPlayer((javax.media.MediaLocator) null);
		javax.media.Manager.createRealizedPlayer((javax.media.protocol.DataSource) null);
		javax.media.Manager.createProcessor((java.net.URL) null);
		javax.media.Manager.createProcessor((javax.media.MediaLocator) null);
		javax.media.Manager.createProcessor((javax.media.protocol.DataSource) null);
		javax.media.Manager.createRealizedProcessor((javax.media.ProcessorModel) null);
		javax.media.Manager.createDataSource((java.net.URL) null);
		javax.media.Manager.createDataSource((javax.media.MediaLocator) null);
		javax.media.Manager.createMergingDataSource((javax.media.protocol.DataSource[]) null);
		javax.media.Manager.createCloneableDataSource((javax.media.protocol.DataSource) null);
		javax.media.Manager.getSystemTimeBase();
		javax.media.Manager.createDataSink((javax.media.protocol.DataSource) null, (javax.media.MediaLocator) null);
		javax.media.Manager.getCacheDirectory();
		javax.media.Manager.setHint(0, (java.lang.Object) null);
		javax.media.Manager.getHint(0);
		javax.media.Manager.getDataSourceList((java.lang.String) null);
		javax.media.Manager.getHandlerClassList((java.lang.String) null);
		javax.media.Manager.getProcessorClassList((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_rtp_event_TimeoutEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.TimeoutEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.TimeoutEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.TimeoutEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("participantLeaving", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.TimeoutEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.TimeoutEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.ReceiveStream.class, boolean.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.TimeoutEvent o = null;
		o.participantLeaving();
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.TimeoutEvent o = null;
		new javax.media.rtp.event.TimeoutEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.ReceiveStream) null, false);
		}
	}
	public void test_javax_media_NoDataSinkException() throws Exception
	{
		assertEquals(javax.media.NoDataSinkException.class.getModifiers(), 1);
		assertTrue(!javax.media.NoDataSinkException.class.isInterface());
		assertTrue(javax.media.NoDataSinkException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NoDataSinkException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NoDataSinkException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.NoDataSinkException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NoDataSinkException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NoDataSinkException o = null;
		new javax.media.NoDataSinkException();
		new javax.media.NoDataSinkException((java.lang.String) null);
		}
	}
	public void test_javax_media_GainChangeEvent() throws Exception
	{
		assertEquals(javax.media.GainChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.GainChangeEvent.class.isInterface());
		assertTrue(javax.media.GainChangeEvent.class.getSuperclass().equals(javax.media.MediaEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getLevel", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getMute", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getSourceGainControl", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.GainControl.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getDB", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.GainChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.GainChangeEvent.class.getConstructor(new Class[]{javax.media.GainControl.class, boolean.class, float.class, float.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.GainChangeEvent o = null;
		o.getLevel();
		o.getMute();
		o.getSource();
		o.getSourceGainControl();
		o.getDB();
		o.toString();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.GainChangeEvent o = null;
		new javax.media.GainChangeEvent((javax.media.GainControl) null, false, 0.f, 0.f);
		}
	}
	public void test_javax_media_format_RGBFormat() throws Exception
	{
		assertEquals(javax.media.format.RGBFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.RGBFormat.class.isInterface());
		assertTrue(javax.media.format.RGBFormat.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.RGBFormat.BIG_ENDIAN == 0);
		assertTrue(javax.media.format.RGBFormat.LITTLE_ENDIAN == 1);
		assertTrue(javax.media.format.RGBFormat.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.RGBFormat.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.RGBFormat.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.RGBFormat.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.RGBFormat.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.RGBFormat.H261.equals("h261"));
		assertTrue(javax.media.format.RGBFormat.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.RGBFormat.H263.equals("h263"));
		assertTrue(javax.media.format.RGBFormat.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.RGBFormat.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.RGBFormat.RGB.equals("rgb"));
		assertTrue(javax.media.format.RGBFormat.YUV.equals("yuv"));
		assertTrue(javax.media.format.RGBFormat.IRGB.equals("irgb"));
		assertTrue(javax.media.format.RGBFormat.SMC.equals("smc"));
		assertTrue(javax.media.format.RGBFormat.RLE.equals("rle"));
		assertTrue(javax.media.format.RGBFormat.RPZA.equals("rpza"));
		assertTrue(javax.media.format.RGBFormat.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.RGBFormat.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.RGBFormat.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.RGBFormat.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.RGBFormat.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.RGBFormat.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.RGBFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.RGBFormat.TRUE == 1);
		assertTrue(javax.media.format.RGBFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getRedMask", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getGreenMask", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getBlueMask", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getEndian", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getLineStride", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getBitsPerPixel", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getPixelStride", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getFlipped", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.RGBFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.RGBFormat.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.RGBFormat.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.RGBFormat.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("redMask");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("greenMask");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("blueMask");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("bitsPerPixel");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("pixelStride");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("lineStride");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("flipped");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("endian");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("BIG_ENDIAN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("LITTLE_ENDIAN");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.RGBFormat.class.getDeclaredField("ENCODING");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 10);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.RGBFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.getRedMask();
		o.getGreenMask();
		o.getBlueMask();
		o.relax();
		o.getEndian();
		o.getLineStride();
		o.getBitsPerPixel();
		o.getPixelStride();
		o.getFlipped();
		o.getSize();
		o.getFrameRate();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.RGBFormat o = null;
		new javax.media.format.RGBFormat();
		new javax.media.format.RGBFormat((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0, 0, 0);
		new javax.media.format.RGBFormat((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0, 0, 0, 0, 0, 0, 0);
		}
	}
	public void test_javax_media_format_JPEGFormat() throws Exception
	{
		assertEquals(javax.media.format.JPEGFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.JPEGFormat.class.isInterface());
		assertTrue(javax.media.format.JPEGFormat.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.JPEGFormat.DEC_422 == 0);
		assertTrue(javax.media.format.JPEGFormat.DEC_420 == 1);
		assertTrue(javax.media.format.JPEGFormat.DEC_444 == 2);
		assertTrue(javax.media.format.JPEGFormat.DEC_402 == 3);
		assertTrue(javax.media.format.JPEGFormat.DEC_411 == 4);
		assertTrue(javax.media.format.JPEGFormat.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.JPEGFormat.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.JPEGFormat.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.JPEGFormat.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.JPEGFormat.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.JPEGFormat.H261.equals("h261"));
		assertTrue(javax.media.format.JPEGFormat.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.JPEGFormat.H263.equals("h263"));
		assertTrue(javax.media.format.JPEGFormat.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.JPEGFormat.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.JPEGFormat.RGB.equals("rgb"));
		assertTrue(javax.media.format.JPEGFormat.YUV.equals("yuv"));
		assertTrue(javax.media.format.JPEGFormat.IRGB.equals("irgb"));
		assertTrue(javax.media.format.JPEGFormat.SMC.equals("smc"));
		assertTrue(javax.media.format.JPEGFormat.RLE.equals("rle"));
		assertTrue(javax.media.format.JPEGFormat.RPZA.equals("rpza"));
		assertTrue(javax.media.format.JPEGFormat.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.JPEGFormat.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.JPEGFormat.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.JPEGFormat.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.JPEGFormat.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.JPEGFormat.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.JPEGFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.JPEGFormat.TRUE == 1);
		assertTrue(javax.media.format.JPEGFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getQFactor", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getDecimation", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.JPEGFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.JPEGFormat.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.JPEGFormat.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("DEC_422");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("DEC_420");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("DEC_444");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("DEC_402");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("DEC_411");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("qFactor");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.format.JPEGFormat.class.getDeclaredField("decimation");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 0);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.JPEGFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.getQFactor();
		o.getDecimation();
		o.getSize();
		o.getFrameRate();
		o.relax();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.JPEGFormat o = null;
		new javax.media.format.JPEGFormat();
		new javax.media.format.JPEGFormat((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0);
		}
	}
	public void test_javax_media_RestartingEvent() throws Exception
	{
		assertEquals(javax.media.RestartingEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.RestartingEvent.class.isInterface());
		assertTrue(javax.media.RestartingEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RestartingEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.RestartingEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.RestartingEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.RestartingEvent o = null;
		new javax.media.RestartingEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_MediaError() throws Exception
	{
		assertEquals(javax.media.MediaError.class.getModifiers(), 1);
		assertTrue(!javax.media.MediaError.class.isInterface());
		assertTrue(javax.media.MediaError.class.getSuperclass().equals(java.lang.Error.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.MediaError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.MediaError.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.MediaError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.MediaError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.MediaError o = null;
		new javax.media.MediaError();
		new javax.media.MediaError((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_SenderReportEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.SenderReportEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.SenderReportEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.SenderReportEvent.class.getSuperclass().equals(javax.media.rtp.event.RemoteEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("getReport", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.rtcp.SenderReport.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SenderReportEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.SenderReportEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.rtcp.SenderReport.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.SenderReportEvent o = null;
		o.getReport();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.SenderReportEvent o = null;
		new javax.media.rtp.event.SenderReportEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.rtcp.SenderReport) null);
		}
	}
	public void test_javax_media_rtp_event_NewSendStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.NewSendStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.NewSendStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.NewSendStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.SendStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewSendStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.NewSendStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.SendStream.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.NewSendStreamEvent o = null;
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.NewSendStreamEvent o = null;
		new javax.media.rtp.event.NewSendStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.SendStream) null);
		}
	}
	public void test_javax_media_StopAtTimeEvent() throws Exception
	{
		assertEquals(javax.media.StopAtTimeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.StopAtTimeEvent.class.isInterface());
		assertTrue(javax.media.StopAtTimeEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopAtTimeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StopAtTimeEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StopAtTimeEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StopAtTimeEvent o = null;
		new javax.media.StopAtTimeEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_CachingControlEvent() throws Exception
	{
		assertEquals(javax.media.CachingControlEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.CachingControlEvent.class.isInterface());
		assertTrue(javax.media.CachingControlEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("getCachingControl", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.CachingControl.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("getContentProgress", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CachingControlEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.CachingControlEvent.class.getConstructor(new Class[]{javax.media.Controller.class, javax.media.CachingControl.class, long.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.CachingControlEvent o = null;
		o.toString();
		o.getCachingControl();
		o.getContentProgress();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.CachingControlEvent o = null;
		new javax.media.CachingControlEvent((javax.media.Controller) null, (javax.media.CachingControl) null, 0L);
		}
	}
	public void test_javax_media_protocol_DataSource() throws Exception
	{
		assertEquals(javax.media.protocol.DataSource.class.getModifiers(), 1025);
		assertTrue(!javax.media.protocol.DataSource.class.isInterface());
		assertTrue(javax.media.protocol.Controls.class.isAssignableFrom(javax.media.protocol.DataSource.class));
		assertTrue(javax.media.Duration.class.isAssignableFrom(javax.media.protocol.DataSource.class));
		assertTrue(javax.media.protocol.DataSource.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.DataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.DataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.protocol.DataSource.class.getConstructor(new Class[]{javax.media.MediaLocator.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.DataSource o = null;
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getLocator();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.setLocator((javax.media.MediaLocator) null);
		o.disconnect();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerRTPDialog() throws Exception
	{
		if (true)
			return;	// TODO: RTP not properly stubbed or implemented.

		assertEquals(javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerRTPDialog.class.isInterface());
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getSuperclass().equals(java.awt.Dialog.class));
		// Static fields: 
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.TOP_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.CENTER_ALIGNMENT == 0.5f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.BOTTOM_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.LEFT_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.RIGHT_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.WIDTH == 1);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.HEIGHT == 2);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.PROPERTIES == 4);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.SOMEBITS == 8);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.FRAMEBITS == 16);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.ALLBITS == 32);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.ERROR == 64);
		assertTrue(javax.media.bean.playerbean.MediaPlayerRTPDialog.ABORT == 128);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getRTPAdr", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getAccessibleContext", new Class[]{});
			assertEquals(m.getReturnType(), javax.accessibility.AccessibleContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("hide", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("show", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setTitle", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setResizable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getTitle", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isModal", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isResizable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isUndecorated", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setModal", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setUndecorated", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getOwner", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Window.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isActive", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setBounds", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addPropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addPropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("dispose", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusCycleRootAncestor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusOwner", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusTraversalKeys", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.util.Set.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getGraphicsConfiguration", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.GraphicsConfiguration.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getListeners", new Class[]{java.lang.Class.class});
			assertEquals(m.getReturnType(), java.util.EventListener[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMostRecentFocusOwner", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusCycleRoot", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isShowing", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("postEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusCycleRoot", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createBufferStrategy", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createBufferStrategy", new Class[]{int.class, java.awt.BufferCapabilities.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getBufferStrategy", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.image.BufferStrategy.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getInputContext", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getLocale", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Locale.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getToolkit", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Toolkit.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusableWindow", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setCursor", new Class[]{java.awt.Cursor.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addWindowListener", new Class[]{java.awt.event.WindowListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("pack", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("toFront", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addWindowFocusListener", new Class[]{java.awt.event.WindowFocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addWindowStateListener", new Class[]{java.awt.event.WindowStateListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("applyResourceBundle", new Class[]{java.util.ResourceBundle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("applyResourceBundle", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusableWindowState", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getOwnedWindows", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Window[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getWarningString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getWindowFocusListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.WindowFocusListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getWindowListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.WindowListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getWindowStateListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.WindowStateListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isAlwaysOnTop", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocused", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isLocationByPlatform", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeWindowFocusListener", new Class[]{java.awt.event.WindowFocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeWindowListener", new Class[]{java.awt.event.WindowListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeWindowStateListener", new Class[]{java.awt.event.WindowStateListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setAlwaysOnTop", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusableWindowState", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLocationByPlatform", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLocationRelativeTo", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("toBack", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.lang.String.class, java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("remove", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("remove", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("list", new Class[]{java.io.PrintStream.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("list", new Class[]{java.io.PrintWriter.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("print", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("update", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getPreferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLayout", new Class[]{java.awt.LayoutManager.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("validate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFont", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("invalidate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("applyComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("areFocusTraversalKeysSet", new Class[]{int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("countComponents", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("deliverEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("doLayout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("findComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("findComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getAlignmentX", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getAlignmentY", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponent", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentCount", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentZOrder", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponents", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getContainerListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ContainerListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusTraversalPolicy", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.FocusTraversalPolicy.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getInsets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getLayout", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.LayoutManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMaximumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMinimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMousePosition", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("insets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isAncestorOf", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusCycleRoot", new Class[]{java.awt.Container.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusTraversalPolicyProvider", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusTraversalPolicySet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("layout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("locate", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("minimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("paint", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("paintComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("preferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("printComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setComponentZOrder", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusTraversalKeys", new Class[]{int.class, java.util.Set.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusTraversalPolicy", new Class[]{java.awt.FocusTraversalPolicy.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusTraversalPolicyProvider", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("transferFocusBackward", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("transferFocusDownCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("add", new Class[]{java.awt.PopupMenu.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getName", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("contains", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("contains", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("size", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getLocation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getParent", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("remove", new Class[]{java.awt.MenuComponent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setName", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("list", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("list", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("list", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setSize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("resize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("resize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isOpaque", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("disable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("enable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("enable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("location", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isValid", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createImage", new Class[]{java.awt.image.ImageProducer.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removePropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removePropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, byte.class, byte.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, char.class, char.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, short.class, short.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, long.class, long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, float.class, float.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, double.class, double.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFont", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Font.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setBackground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setForeground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getBounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getBackground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getForeground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLocation", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("dispatchEvent", new Class[]{java.awt.AWTEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMousePosition", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getPeer", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.peer.ComponentPeer.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getTreeLock", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("handleEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isDisplayable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusOwner", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isLightweight", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isMaximumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isMinimumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isPreferredSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("requestFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("transferFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("action", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("addMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("bounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("checkImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("checkImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createVolatileImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("createVolatileImage", new Class[]{int.class, int.class, java.awt.ImageCapabilities.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("enableInputMethods", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getColorModel", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.image.ColorModel.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ComponentListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getComponentOrientation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.ComponentOrientation.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getCursor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Cursor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getDropTarget", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.dnd.DropTarget.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.FocusListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFocusTraversalKeysEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getFontMetrics", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), java.awt.FontMetrics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getGraphics", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Graphics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getHierarchyBoundsListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyBoundsListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getHierarchyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getIgnoreRepaint", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getInputMethodListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.InputMethodListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getInputMethodRequests", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputMethodRequests.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getKeyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.KeyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getLocationOnScreen", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMouseListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMouseMotionListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseMotionListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getMouseWheelListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseWheelListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getPropertyChangeListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getPropertyChangeListeners", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getWidth", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getX", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getY", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("gotFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("hasFocus", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("imageUpdate", new Class[]{java.awt.Image.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("inside", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isBackgroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isCursorSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isDoubleBuffered", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFocusTraversable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isFontSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("isForegroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("keyDown", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("keyUp", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("lostFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseDown", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseDrag", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseEnter", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseExit", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseMove", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("mouseUp", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("move", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("nextFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("paintAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("printAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("removeMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("repaint", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("repaint", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("repaint", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("repaint", new Class[]{long.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("requestFocusInWindow", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("reshape", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setDropTarget", new Class[]{java.awt.dnd.DropTarget.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusTraversalKeysEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setFocusable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setIgnoreRepaint", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setLocale", new Class[]{java.util.Locale.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setMaximumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setMinimumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("setPreferredSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("show", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("transferFocusUpCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getConstructor(new Class[]{java.awt.Frame.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("IPAdrFld");
			assertEquals(f.getType().getName(), "java.awt.TextField");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("PortFld");
			assertEquals(f.getType().getName(), "java.awt.TextField");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("ttlFld");
			assertEquals(f.getType().getName(), "java.awt.TextField");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("cbFormat");
			assertEquals(f.getType().getName(), "java.awt.Choice");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("OKButton");
			assertEquals(f.getType().getName(), "java.awt.Button");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("CancelButton");
			assertEquals(f.getType().getName(), "java.awt.Button");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerRTPDialog.class.getDeclaredField("rtpString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 0);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerRTPDialog o = null;
		o.getRTPAdr();
		o.addNotify();
		o.getAccessibleContext();
		o.hide();
		o.show();
		o.setTitle((java.lang.String) null);
		o.setResizable(false);
		o.getTitle();
		o.isModal();
		o.isResizable();
		o.isUndecorated();
		o.setModal(false);
		o.setUndecorated(false);
		o.getOwner();
		o.isActive();
		o.setBounds(0, 0, 0, 0);
		o.addPropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.addPropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.dispose();
		o.getFocusCycleRootAncestor();
		o.getFocusOwner();
		o.getFocusTraversalKeys(0);
		o.getGraphicsConfiguration();
		o.getListeners((java.lang.Class) null);
		o.getMostRecentFocusOwner();
		o.isFocusCycleRoot();
		o.isShowing();
		o.postEvent((java.awt.Event) null);
		o.setFocusCycleRoot(false);
		o.createBufferStrategy(0);
		o.createBufferStrategy(0, (java.awt.BufferCapabilities) null);
		o.getBufferStrategy();
		o.getInputContext();
		o.getLocale();
		o.getToolkit();
		o.isFocusableWindow();
		o.setCursor((java.awt.Cursor) null);
		o.addWindowListener((java.awt.event.WindowListener) null);
		o.pack();
		o.toFront();
		o.addWindowFocusListener((java.awt.event.WindowFocusListener) null);
		o.addWindowStateListener((java.awt.event.WindowStateListener) null);
		o.applyResourceBundle((java.util.ResourceBundle) null);
		o.applyResourceBundle((java.lang.String) null);
		o.getFocusableWindowState();
		o.getOwnedWindows();
		o.getWarningString();
		o.getWindowFocusListeners();
		o.getWindowListeners();
		o.getWindowStateListeners();
		o.isAlwaysOnTop();
		o.isFocused();
		o.isLocationByPlatform();
		o.removeWindowFocusListener((java.awt.event.WindowFocusListener) null);
		o.removeWindowListener((java.awt.event.WindowListener) null);
		o.removeWindowStateListener((java.awt.event.WindowStateListener) null);
		o.setAlwaysOnTop(false);
		o.setFocusableWindowState(false);
		o.setLocationByPlatform(false);
		o.setLocationRelativeTo((java.awt.Component) null);
		o.toBack();
		o.add((java.awt.Component) null);
		o.add((java.lang.String) null, (java.awt.Component) null);
		o.add((java.awt.Component) null, 0);
		o.add((java.awt.Component) null, (java.lang.Object) null);
		o.add((java.awt.Component) null, (java.lang.Object) null, 0);
		o.remove(0);
		o.remove((java.awt.Component) null);
		o.list((java.io.PrintStream) null, 0);
		o.list((java.io.PrintWriter) null, 0);
		o.print((java.awt.Graphics) null);
		o.removeAll();
		o.update((java.awt.Graphics) null);
		o.getPreferredSize();
		o.setLayout((java.awt.LayoutManager) null);
		o.validate();
		o.setFont((java.awt.Font) null);
		o.invalidate();
		o.addContainerListener((java.awt.event.ContainerListener) null);
		o.applyComponentOrientation((java.awt.ComponentOrientation) null);
		o.areFocusTraversalKeysSet(0);
		o.countComponents();
		o.deliverEvent((java.awt.Event) null);
		o.doLayout();
		o.findComponentAt(0, 0);
		o.findComponentAt((java.awt.Point) null);
		o.getAlignmentX();
		o.getAlignmentY();
		o.getComponent(0);
		o.getComponentAt(0, 0);
		o.getComponentAt((java.awt.Point) null);
		o.getComponentCount();
		o.getComponentZOrder((java.awt.Component) null);
		o.getComponents();
		o.getContainerListeners();
		o.getFocusTraversalPolicy();
		o.getInsets();
		o.getLayout();
		o.getMaximumSize();
		o.getMinimumSize();
		o.getMousePosition(false);
		o.insets();
		o.isAncestorOf((java.awt.Component) null);
		o.isFocusCycleRoot((java.awt.Container) null);
		o.isFocusTraversalPolicyProvider();
		o.isFocusTraversalPolicySet();
		o.layout();
		o.locate(0, 0);
		o.minimumSize();
		o.paint((java.awt.Graphics) null);
		o.paintComponents((java.awt.Graphics) null);
		o.preferredSize();
		o.printComponents((java.awt.Graphics) null);
		o.removeContainerListener((java.awt.event.ContainerListener) null);
		o.removeNotify();
		o.setComponentZOrder((java.awt.Component) null, 0);
		o.setFocusTraversalKeys(0, (java.util.Set) null);
		o.setFocusTraversalPolicy((java.awt.FocusTraversalPolicy) null);
		o.setFocusTraversalPolicyProvider(false);
		o.transferFocusBackward();
		o.transferFocusDownCycle();
		o.add((java.awt.PopupMenu) null);
		o.getName();
		o.toString();
		o.contains(0, 0);
		o.contains((java.awt.Point) null);
		o.size();
		o.getLocation();
		o.getLocation((java.awt.Point) null);
		o.getParent();
		o.remove((java.awt.MenuComponent) null);
		o.setName((java.lang.String) null);
		o.list();
		o.list((java.io.PrintStream) null);
		o.list((java.io.PrintWriter) null);
		o.getSize();
		o.getSize((java.awt.Dimension) null);
		o.setSize(0, 0);
		o.setSize((java.awt.Dimension) null);
		o.resize(0, 0);
		o.resize((java.awt.Dimension) null);
		o.isOpaque();
		o.disable();
		o.enable();
		o.enable(false);
		o.location();
		o.isValid();
		o.createImage((java.awt.image.ImageProducer) null);
		o.createImage(0, 0);
		o.isVisible();
		o.setBounds((java.awt.Rectangle) null);
		o.removePropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.removePropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.setVisible(false);
		o.addComponentListener((java.awt.event.ComponentListener) null);
		o.firePropertyChange((java.lang.String) null, (byte) 0, (byte) 0);
		o.firePropertyChange((java.lang.String) null, (char) 0, (char) 0);
		o.firePropertyChange((java.lang.String) null, (short) 0, (short) 0);
		o.firePropertyChange((java.lang.String) null, 0L, 0L);
		o.firePropertyChange((java.lang.String) null, 0.f, 0.f);
		o.firePropertyChange((java.lang.String) null, 0.0, 0.0);
		o.getFont();
		o.addMouseListener((java.awt.event.MouseListener) null);
		o.removeMouseListener((java.awt.event.MouseListener) null);
		o.setBackground((java.awt.Color) null);
		o.setForeground((java.awt.Color) null);
		o.setEnabled(false);
		o.getBounds();
		o.getBounds((java.awt.Rectangle) null);
		o.getBackground();
		o.getForeground();
		o.isEnabled();
		o.setLocation(0, 0);
		o.setLocation((java.awt.Point) null);
		o.dispatchEvent((java.awt.AWTEvent) null);
		o.getMousePosition();
		o.getPeer();
		o.getTreeLock();
		o.handleEvent((java.awt.Event) null);
		o.isDisplayable();
		o.isFocusOwner();
		o.isFocusable();
		o.isLightweight();
		o.isMaximumSizeSet();
		o.isMinimumSizeSet();
		o.isPreferredSizeSet();
		o.requestFocus();
		o.transferFocus();
		o.action((java.awt.Event) null, (java.lang.Object) null);
		o.addFocusListener((java.awt.event.FocusListener) null);
		o.addHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.addHierarchyListener((java.awt.event.HierarchyListener) null);
		o.addInputMethodListener((java.awt.event.InputMethodListener) null);
		o.addKeyListener((java.awt.event.KeyListener) null);
		o.addMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.addMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.bounds();
		o.checkImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.checkImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.createVolatileImage(0, 0);
		o.createVolatileImage(0, 0, (java.awt.ImageCapabilities) null);
		o.enableInputMethods(false);
		o.getColorModel();
		o.getComponentListeners();
		o.getComponentOrientation();
		o.getCursor();
		o.getDropTarget();
		o.getFocusListeners();
		o.getFocusTraversalKeysEnabled();
		o.getFontMetrics((java.awt.Font) null);
		o.getGraphics();
		o.getHeight();
		o.getHierarchyBoundsListeners();
		o.getHierarchyListeners();
		o.getIgnoreRepaint();
		o.getInputMethodListeners();
		o.getInputMethodRequests();
		o.getKeyListeners();
		o.getLocationOnScreen();
		o.getMouseListeners();
		o.getMouseMotionListeners();
		o.getMouseWheelListeners();
		o.getPropertyChangeListeners();
		o.getPropertyChangeListeners((java.lang.String) null);
		o.getWidth();
		o.getX();
		o.getY();
		o.gotFocus((java.awt.Event) null, (java.lang.Object) null);
		o.hasFocus();
		o.imageUpdate((java.awt.Image) null, 0, 0, 0, 0, 0);
		o.inside(0, 0);
		o.isBackgroundSet();
		o.isCursorSet();
		o.isDoubleBuffered();
		o.isFocusTraversable();
		o.isFontSet();
		o.isForegroundSet();
		o.keyDown((java.awt.Event) null, 0);
		o.keyUp((java.awt.Event) null, 0);
		o.lostFocus((java.awt.Event) null, (java.lang.Object) null);
		o.mouseDown((java.awt.Event) null, 0, 0);
		o.mouseDrag((java.awt.Event) null, 0, 0);
		o.mouseEnter((java.awt.Event) null, 0, 0);
		o.mouseExit((java.awt.Event) null, 0, 0);
		o.mouseMove((java.awt.Event) null, 0, 0);
		o.mouseUp((java.awt.Event) null, 0, 0);
		o.move(0, 0);
		o.nextFocus();
		o.paintAll((java.awt.Graphics) null);
		o.prepareImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.prepareImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.printAll((java.awt.Graphics) null);
		o.removeComponentListener((java.awt.event.ComponentListener) null);
		o.removeFocusListener((java.awt.event.FocusListener) null);
		o.removeHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.removeHierarchyListener((java.awt.event.HierarchyListener) null);
		o.removeInputMethodListener((java.awt.event.InputMethodListener) null);
		o.removeKeyListener((java.awt.event.KeyListener) null);
		o.removeMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.removeMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.repaint();
		o.repaint(0L);
		o.repaint(0, 0, 0, 0);
		o.repaint(0L, 0, 0, 0, 0);
		o.requestFocusInWindow();
		o.reshape(0, 0, 0, 0);
		o.setComponentOrientation((java.awt.ComponentOrientation) null);
		o.setDropTarget((java.awt.dnd.DropTarget) null);
		o.setFocusTraversalKeysEnabled(false);
		o.setFocusable(false);
		o.setIgnoreRepaint(false);
		o.setLocale((java.util.Locale) null);
		o.setMaximumSize((java.awt.Dimension) null);
		o.setMinimumSize((java.awt.Dimension) null);
		o.setPreferredSize((java.awt.Dimension) null);
		o.show(false);
		o.transferFocusUpCycle();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerRTPDialog o = null;
		new javax.media.bean.playerbean.MediaPlayerRTPDialog((java.awt.Frame) null);
		}
	}
	public void test_javax_media_format_IndexedColorFormat() throws Exception
	{
		assertEquals(javax.media.format.IndexedColorFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.IndexedColorFormat.class.isInterface());
		assertTrue(javax.media.format.IndexedColorFormat.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.IndexedColorFormat.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.IndexedColorFormat.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.IndexedColorFormat.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.IndexedColorFormat.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.IndexedColorFormat.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.IndexedColorFormat.H261.equals("h261"));
		assertTrue(javax.media.format.IndexedColorFormat.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.IndexedColorFormat.H263.equals("h263"));
		assertTrue(javax.media.format.IndexedColorFormat.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.IndexedColorFormat.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.IndexedColorFormat.RGB.equals("rgb"));
		assertTrue(javax.media.format.IndexedColorFormat.YUV.equals("yuv"));
		assertTrue(javax.media.format.IndexedColorFormat.IRGB.equals("irgb"));
		assertTrue(javax.media.format.IndexedColorFormat.SMC.equals("smc"));
		assertTrue(javax.media.format.IndexedColorFormat.RLE.equals("rle"));
		assertTrue(javax.media.format.IndexedColorFormat.RPZA.equals("rpza"));
		assertTrue(javax.media.format.IndexedColorFormat.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.IndexedColorFormat.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.IndexedColorFormat.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.IndexedColorFormat.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.IndexedColorFormat.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.IndexedColorFormat.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.IndexedColorFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.IndexedColorFormat.TRUE == 1);
		assertTrue(javax.media.format.IndexedColorFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getMapSize", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getRedValues", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getGreenValues", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getBlueValues", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getLineStride", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.IndexedColorFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.IndexedColorFormat.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class, byte[].class, byte[].class, byte[].class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("lineStride");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("redValues");
			assertEquals(f.getType().getName(), "[B");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("greenValues");
			assertEquals(f.getType().getName(), "[B");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("blueValues");
			assertEquals(f.getType().getName(), "[B");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("mapSize");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.IndexedColorFormat.class.getDeclaredField("ENCODING");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 10);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.IndexedColorFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.relax();
		o.getMapSize();
		o.getRedValues();
		o.getGreenValues();
		o.getBlueValues();
		o.getLineStride();
		o.toString();
		o.getSize();
		o.getFrameRate();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.IndexedColorFormat o = null;
		new javax.media.format.IndexedColorFormat((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0, (byte[]) null, (byte[]) null, (byte[]) null);
		}
	}
	public void test_javax_media_rtp_event_ApplicationEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ApplicationEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ApplicationEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ApplicationEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getAppSubType", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getAppString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getAppData", new Class[]{});
			assertEquals(m.getReturnType(), byte[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ApplicationEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ApplicationEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class, javax.media.rtp.ReceiveStream.class, int.class, java.lang.String.class, byte[].class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ApplicationEvent o = null;
		o.getAppSubType();
		o.getAppString();
		o.getAppData();
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ApplicationEvent o = null;
		new javax.media.rtp.event.ApplicationEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null, (javax.media.rtp.ReceiveStream) null, 0, (java.lang.String) null, (byte[]) null);
		}
	}
	public void test_javax_media_CannotRealizeException() throws Exception
	{
		assertEquals(javax.media.CannotRealizeException.class.getModifiers(), 1);
		assertTrue(!javax.media.CannotRealizeException.class.isInterface());
		assertTrue(javax.media.CannotRealizeException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CannotRealizeException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.CannotRealizeException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.CannotRealizeException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.CannotRealizeException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.CannotRealizeException o = null;
		new javax.media.CannotRealizeException();
		new javax.media.CannotRealizeException((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_SendStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.SendStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.SendStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.SendStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.RTPEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.SendStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.SendStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.SendStream.class, javax.media.rtp.Participant.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.SendStreamEvent o = null;
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.SendStreamEvent o = null;
		new javax.media.rtp.event.SendStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.SendStream) null, (javax.media.rtp.Participant) null);
		}
	}
	public void test_javax_media_Time() throws Exception
	{
		assertEquals(javax.media.Time.class.getModifiers(), 1);
		assertTrue(!javax.media.Time.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.Time.class));
		assertTrue(javax.media.Time.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.Time.ONE_SECOND == 1000000000L);
		// TODO: test TIME_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.Time.class.getMethod("getSeconds", new Class[]{});
			assertEquals(m.getReturnType(), double.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Time.class.getMethod("getNanoseconds", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Time.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.Time.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Time.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Time.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Time.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Time.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Time.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Time.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Time.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.Time.class.getConstructor(new Class[]{long.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.Time.class.getConstructor(new Class[]{double.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.Time.class.getDeclaredField("ONE_SECOND");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Time.class.getDeclaredField("TIME_UNKNOWN");
			assertEquals(f.getType().getName(), "javax.media.Time");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Time.class.getDeclaredField("NANO_TO_SEC");
			assertEquals(f.getType().getName(), "double");
			assertEquals(f.getModifiers(), 26);
		}
		{
			final Field f = javax.media.Time.class.getDeclaredField("nanoseconds");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 4);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.Time o = null;
		o.getSeconds();
		o.getNanoseconds();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.Time o = null;
		new javax.media.Time(0L);
		new javax.media.Time(0.0);
		}
	}
	public void test_javax_media_rtp_InvalidSessionAddressException() throws Exception
	{
		assertEquals(javax.media.rtp.InvalidSessionAddressException.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.InvalidSessionAddressException.class.isInterface());
		assertTrue(javax.media.rtp.InvalidSessionAddressException.class.getSuperclass().equals(javax.media.rtp.SessionManagerException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.InvalidSessionAddressException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.InvalidSessionAddressException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.InvalidSessionAddressException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.InvalidSessionAddressException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.InvalidSessionAddressException o = null;
		new javax.media.rtp.InvalidSessionAddressException();
		new javax.media.rtp.InvalidSessionAddressException((java.lang.String) null);
		}
	}
	public void test_javax_media_SizeChangeEvent() throws Exception
	{
		assertEquals(javax.media.SizeChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.SizeChangeEvent.class.isInterface());
		assertTrue(javax.media.SizeChangeEvent.class.getSuperclass().equals(javax.media.format.FormatChangeEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getWidth", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getScale", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getOldFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getNewFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SizeChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.SizeChangeEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, float.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.SizeChangeEvent o = null;
		o.getHeight();
		o.getWidth();
		o.getScale();
		o.getOldFormat();
		o.getNewFormat();
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.SizeChangeEvent o = null;
		new javax.media.SizeChangeEvent((javax.media.Controller) null, 0, 0, 0.f);
		}
	}
	public void test_javax_media_PrefetchCompleteEvent() throws Exception
	{
		assertEquals(javax.media.PrefetchCompleteEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.PrefetchCompleteEvent.class.isInterface());
		assertTrue(javax.media.PrefetchCompleteEvent.class.getSuperclass().equals(javax.media.TransitionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PrefetchCompleteEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.PrefetchCompleteEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.PrefetchCompleteEvent o = null;
		o.toString();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.PrefetchCompleteEvent o = null;
		new javax.media.PrefetchCompleteEvent((javax.media.Controller) null, 0, 0, 0);
		}
	}
	public void test_javax_media_ControllerErrorEvent() throws Exception
	{
		assertEquals(javax.media.ControllerErrorEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ControllerErrorEvent.class.isInterface());
		assertTrue(javax.media.ControllerErrorEvent.class.getSuperclass().equals(javax.media.ControllerClosedEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerErrorEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ControllerErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ControllerErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ControllerErrorEvent o = null;
		o.toString();
		o.getMessage();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ControllerErrorEvent o = null;
		new javax.media.ControllerErrorEvent((javax.media.Controller) null);
		new javax.media.ControllerErrorEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_SystemTimeBase() throws Exception
	{
		assertEquals(javax.media.SystemTimeBase.class.getModifiers(), 17);
		assertTrue(!javax.media.SystemTimeBase.class.isInterface());
		assertTrue(javax.media.TimeBase.class.isAssignableFrom(javax.media.SystemTimeBase.class));
		assertTrue(javax.media.SystemTimeBase.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("getTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("getNanoseconds", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.SystemTimeBase.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.SystemTimeBase.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.SystemTimeBase o = null;
		o.getTime();
		o.getNanoseconds();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.SystemTimeBase o = null;
		new javax.media.SystemTimeBase();
		}
	}
	public void test_javax_media_format_YUVFormat() throws Exception
	{
		assertEquals(javax.media.format.YUVFormat.class.getModifiers(), 1);
		assertTrue(!javax.media.format.YUVFormat.class.isInterface());
		assertTrue(javax.media.format.YUVFormat.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.YUVFormat.YUV_411 == 1);
		assertTrue(javax.media.format.YUVFormat.YUV_420 == 2);
		assertTrue(javax.media.format.YUVFormat.YUV_422 == 4);
		assertTrue(javax.media.format.YUVFormat.YUV_111 == 8);
		assertTrue(javax.media.format.YUVFormat.YUV_YVU9 == 16);
		assertTrue(javax.media.format.YUVFormat.YUV_YUYV == 32);
		assertTrue(javax.media.format.YUVFormat.YUV_SIGNED == 64);
		assertTrue(javax.media.format.YUVFormat.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.YUVFormat.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.YUVFormat.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.YUVFormat.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.YUVFormat.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.YUVFormat.H261.equals("h261"));
		assertTrue(javax.media.format.YUVFormat.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.YUVFormat.H263.equals("h263"));
		assertTrue(javax.media.format.YUVFormat.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.YUVFormat.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.YUVFormat.RGB.equals("rgb"));
		assertTrue(javax.media.format.YUVFormat.YUV.equals("yuv"));
		assertTrue(javax.media.format.YUVFormat.IRGB.equals("irgb"));
		assertTrue(javax.media.format.YUVFormat.SMC.equals("smc"));
		assertTrue(javax.media.format.YUVFormat.RLE.equals("rle"));
		assertTrue(javax.media.format.YUVFormat.RPZA.equals("rpza"));
		assertTrue(javax.media.format.YUVFormat.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.YUVFormat.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.YUVFormat.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.YUVFormat.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.YUVFormat.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.YUVFormat.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.YUVFormat.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.YUVFormat.TRUE == 1);
		assertTrue(javax.media.format.YUVFormat.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getYuvType", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getStrideY", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getStrideUV", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getOffsetY", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getOffsetU", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getOffsetV", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.YUVFormat.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.YUVFormat.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.YUVFormat.class.getConstructor(new Class[]{int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.YUVFormat.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_411");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_420");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_422");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_111");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_YVU9");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_YUYV");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("YUV_SIGNED");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("yuvType");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("strideY");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("strideUV");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("offsetY");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("offsetU");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("offsetV");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.YUVFormat.class.getDeclaredField("ENCODING");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 10);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.YUVFormat o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.relax();
		o.getYuvType();
		o.getStrideY();
		o.getStrideUV();
		o.getOffsetY();
		o.getOffsetU();
		o.getOffsetV();
		o.getSize();
		o.getFrameRate();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.YUVFormat o = null;
		new javax.media.format.YUVFormat();
		new javax.media.format.YUVFormat(0);
		new javax.media.format.YUVFormat((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0, 0, 0, 0, 0, 0);
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayer() throws Exception
	{
		if (true)
			return;	// TODO: GUI classes not properly stubbed or implemented.

		assertEquals(javax.media.bean.playerbean.MediaPlayer.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayer.class.isInterface());
		assertTrue(javax.media.Player.class.isAssignableFrom(javax.media.bean.playerbean.MediaPlayer.class));
		assertTrue(java.io.Externalizable.class.isAssignableFrom(javax.media.bean.playerbean.MediaPlayer.class));
		assertTrue(javax.media.bean.playerbean.MediaPlayer.class.getSuperclass().equals(java.awt.Container.class));
		// Static fields: 
		// TODO: test LATENCY_UNKNOWN of type javax.media.Time
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Unrealized == 100);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Realizing == 200);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Realized == 300);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Prefetching == 400);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Prefetched == 500);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.Started == 600);
		// TODO: test RESET of type javax.media.Time
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time
		assertTrue(javax.media.bean.playerbean.MediaPlayer.TOP_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.CENTER_ALIGNMENT == 0.5f);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.BOTTOM_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.LEFT_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.RIGHT_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.WIDTH == 1);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.HEIGHT == 2);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.PROPERTIES == 4);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.SOMEBITS == 8);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.FRAMEBITS == 16);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.ALLBITS == 32);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.ERROR == 64);
		assertTrue(javax.media.bean.playerbean.MediaPlayer.ABORT == 128);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("close", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMediaLocation", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMediaLocation", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMediaLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setDataSource", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setPlayer", new Class[]{javax.media.Player.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPlaybackLoop", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setPlaybackLoop", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isPlayBackLoop", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setZoomTo", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getZoomTo", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getControlPanelHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMediaLocationHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setVolumeLevel", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getVolumeLevel", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isMediaLocationVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMediaLocationVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isControlPanelVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setControlPanelVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isCachingControlVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setCachingControlVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFixedAspectRatio", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFixedAspectRatio", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setPopupActive", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getVisualComponent", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getGainControl", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.GainControl.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getControlPanelComponent", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addController", new Class[]{javax.media.Controller.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPlayer", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Player.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeController", new Class[]{javax.media.Controller.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setSource", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("realize", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("prefetch", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("deallocate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getStartLatency", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Control[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), javax.media.Control.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addControllerListener", new Class[]{javax.media.ControllerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeControllerListener", new Class[]{javax.media.ControllerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setTimeBase", new Class[]{javax.media.TimeBase.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("syncStart", new Class[]{javax.media.Time.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("stopAndDeallocate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setStopTime", new Class[]{javax.media.Time.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getStopTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMediaTime", new Class[]{javax.media.Time.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMediaNanoseconds", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getSyncTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getTimeBase", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.TimeBase.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mapToTimeBase", new Class[]{javax.media.Time.class});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setRate", new Class[]{float.class});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("waitForState", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("readExternal", new Class[]{java.io.ObjectInput.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("writeExternal", new Class[]{java.io.ObjectOutput.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setBounds", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPreferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addPropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removePropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setCodeBase", new Class[]{java.net.URL.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("saveMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("restoreMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.lang.String.class, java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("remove", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("remove", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("list", new Class[]{java.io.PrintStream.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("list", new Class[]{java.io.PrintWriter.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("print", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("update", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addPropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setLayout", new Class[]{java.awt.LayoutManager.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("validate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFont", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("invalidate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("applyComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("areFocusTraversalKeysSet", new Class[]{int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("countComponents", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("deliverEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("doLayout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("findComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("findComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getAlignmentX", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getAlignmentY", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponent", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentCount", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentZOrder", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponents", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getContainerListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ContainerListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFocusTraversalKeys", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.util.Set.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFocusTraversalPolicy", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.FocusTraversalPolicy.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getInsets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getLayout", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.LayoutManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getListeners", new Class[]{java.lang.Class.class});
			assertEquals(m.getReturnType(), java.util.EventListener[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMaximumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMinimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMousePosition", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("insets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isAncestorOf", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusCycleRoot", new Class[]{java.awt.Container.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusCycleRoot", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusTraversalPolicyProvider", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusTraversalPolicySet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("layout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("locate", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("minimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("paint", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("paintComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("preferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("printComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setComponentZOrder", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusCycleRoot", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusTraversalKeys", new Class[]{int.class, java.util.Set.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusTraversalPolicy", new Class[]{java.awt.FocusTraversalPolicy.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusTraversalPolicyProvider", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("transferFocusBackward", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("transferFocusDownCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("add", new Class[]{java.awt.PopupMenu.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getName", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("contains", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("contains", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("size", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getLocation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getParent", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("remove", new Class[]{java.awt.MenuComponent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setName", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("list", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("list", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("list", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setSize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("resize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("resize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isOpaque", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("disable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("enable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("enable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("location", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isValid", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("createImage", new Class[]{java.awt.image.ImageProducer.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("createImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removePropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, byte.class, byte.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, char.class, char.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, short.class, short.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, long.class, long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, float.class, float.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, double.class, double.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFont", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Font.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setBackground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setForeground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getBounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getBackground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getForeground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setLocation", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("dispatchEvent", new Class[]{java.awt.AWTEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getAccessibleContext", new Class[]{});
			assertEquals(m.getReturnType(), javax.accessibility.AccessibleContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFocusCycleRootAncestor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getGraphicsConfiguration", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.GraphicsConfiguration.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMousePosition", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPeer", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.peer.ComponentPeer.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getTreeLock", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("handleEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isDisplayable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusOwner", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isLightweight", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isMaximumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isMinimumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isPreferredSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isShowing", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("postEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("requestFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("transferFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("action", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("addMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("bounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("checkImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("checkImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("createVolatileImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("createVolatileImage", new Class[]{int.class, int.class, java.awt.ImageCapabilities.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("enableInputMethods", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getColorModel", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.image.ColorModel.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ComponentListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getComponentOrientation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.ComponentOrientation.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getCursor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Cursor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getDropTarget", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.dnd.DropTarget.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFocusListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.FocusListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFocusTraversalKeysEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getFontMetrics", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), java.awt.FontMetrics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getGraphics", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Graphics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getHierarchyBoundsListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyBoundsListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getHierarchyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getIgnoreRepaint", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getInputContext", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getInputMethodListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.InputMethodListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getInputMethodRequests", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputMethodRequests.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getKeyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.KeyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getLocale", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Locale.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getLocationOnScreen", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMouseListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMouseMotionListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseMotionListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getMouseWheelListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseWheelListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPropertyChangeListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getPropertyChangeListeners", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getToolkit", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Toolkit.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getWidth", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getX", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getY", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("gotFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("hasFocus", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("hide", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("imageUpdate", new Class[]{java.awt.Image.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("inside", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isBackgroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isCursorSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isDoubleBuffered", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFocusTraversable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isFontSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("isForegroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("keyDown", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("keyUp", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("lostFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseDown", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseDrag", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseEnter", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseExit", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseMove", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("mouseUp", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("move", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("nextFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("paintAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("printAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("removeMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("repaint", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("repaint", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("repaint", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("repaint", new Class[]{long.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("requestFocusInWindow", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("reshape", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setCursor", new Class[]{java.awt.Cursor.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setDropTarget", new Class[]{java.awt.dnd.DropTarget.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusTraversalKeysEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setFocusable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setIgnoreRepaint", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setLocale", new Class[]{java.util.Locale.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMaximumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setMinimumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("setPreferredSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("show", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("show", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("transferFocusUpCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayer.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayer.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("changes");
			assertEquals(f.getType().getName(), "java.beans.PropertyChangeSupport");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("urlString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("mrl");
			assertEquals(f.getType().getName(), "javax.media.MediaLocator");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("url");
			assertEquals(f.getType().getName(), "java.net.URL");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("mpAppletContext");
			assertEquals(f.getType().getName(), "java.applet.AppletContext");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("panelVisible");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("cachingVisible");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("fixedAspectRatio");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("fitVideo");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("looping");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("player");
			assertEquals(f.getType().getName(), "javax.media.Player");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("panel");
			assertEquals(f.getType().getName(), "java.awt.Panel");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("vPanel");
			assertEquals(f.getType().getName(), "java.awt.Panel");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("newPanel");
			assertEquals(f.getType().getName(), "java.awt.Panel");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("visualComponent");
			assertEquals(f.getType().getName(), "java.awt.Component");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("controlComponent");
			assertEquals(f.getType().getName(), "java.awt.Component");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("cachingComponent");
			assertEquals(f.getType().getName(), "java.awt.Component");
			assertEquals(f.getModifiers(), 128);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("controlPanelHeight");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 130);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("urlFieldHeight");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 130);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("preferredHeight");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("preferredWidth");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("state");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("controlListeners");
			assertEquals(f.getType().getName(), "java.util.Vector");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("zoomMenu");
			assertEquals(f.getType().getName(), "java.awt.PopupMenu");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("mpCodeBase");
			assertEquals(f.getType().getName(), "java.net.URL");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("gainControl");
			assertEquals(f.getType().getName(), "javax.media.GainControl");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("curVolumeLevel");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("curVolumeValue");
			assertEquals(f.getType().getName(), "float");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("curZoomLevel");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("curZoomValue");
			assertEquals(f.getType().getName(), "float");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("mediaTime");
			assertEquals(f.getType().getName(), "javax.media.Time");
			assertEquals(f.getModifiers(), 132);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("selfListener");
			assertEquals(f.getType().getName(), "javax.media.bean.playerbean.MediaPlayer$InternalControllerAdapter");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("contentLength");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("fixtedFirstTime");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("displayURL");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("isPopupActive");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("urlName");
			assertEquals(f.getType().getName(), "java.awt.TextField");
			assertEquals(f.getModifiers(), 130);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("mouseListen");
			assertEquals(f.getType().getName(), "javax.media.bean.playerbean.MediaPlayer$visualMouseAdapter");
			assertEquals(f.getModifiers(), 130);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayer.class.getDeclaredField("errMeth");
			assertEquals(f.getType().getName(), "java.lang.reflect.Method");
			assertEquals(f.getModifiers(), 0);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayer o = null;
		o.start();
		o.getState();
		o.stop();
		o.close();
		o.getDuration();
		o.getMediaLocation();
		o.setMediaLocation((java.lang.String) null);
		o.setMediaLocator((javax.media.MediaLocator) null);
		o.setDataSource((javax.media.protocol.DataSource) null);
		o.setPlayer((javax.media.Player) null);
		o.getPlaybackLoop();
		o.setPlaybackLoop(false);
		o.isPlayBackLoop();
		o.setZoomTo((java.lang.String) null);
		o.getZoomTo();
		o.getControlPanelHeight();
		o.getMediaLocationHeight();
		o.setVolumeLevel((java.lang.String) null);
		o.getVolumeLevel();
		o.isMediaLocationVisible();
		o.setMediaLocationVisible(false);
		o.isControlPanelVisible();
		o.setControlPanelVisible(false);
		o.isCachingControlVisible();
		o.setCachingControlVisible(false);
		o.isFixedAspectRatio();
		o.setFixedAspectRatio(false);
		o.setPopupActive(false);
		o.getVisualComponent();
		o.getGainControl();
		o.getControlPanelComponent();
		o.addController((javax.media.Controller) null);
		o.getPlayer();
		o.removeController((javax.media.Controller) null);
		o.setSource((javax.media.protocol.DataSource) null);
		o.getTargetState();
		o.realize();
		o.prefetch();
		o.deallocate();
		o.getStartLatency();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.addControllerListener((javax.media.ControllerListener) null);
		o.removeControllerListener((javax.media.ControllerListener) null);
		o.setTimeBase((javax.media.TimeBase) null);
		o.syncStart((javax.media.Time) null);
		o.stopAndDeallocate();
		o.setStopTime((javax.media.Time) null);
		o.getStopTime();
		o.setMediaTime((javax.media.Time) null);
		o.getMediaTime();
		o.getMediaNanoseconds();
		o.getSyncTime();
		o.getTimeBase();
		o.mapToTimeBase((javax.media.Time) null);
		o.getRate();
		o.setRate(0.f);
		o.waitForState(0);
		o.readExternal((java.io.ObjectInput) null);
		o.writeExternal((java.io.ObjectOutput) null);
		o.setBounds(0, 0, 0, 0);
		o.getPreferredSize();
		o.addPropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.removePropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.setCodeBase((java.net.URL) null);
		o.saveMediaTime();
		o.restoreMediaTime();
		o.add((java.awt.Component) null);
		o.add((java.lang.String) null, (java.awt.Component) null);
		o.add((java.awt.Component) null, 0);
		o.add((java.awt.Component) null, (java.lang.Object) null);
		o.add((java.awt.Component) null, (java.lang.Object) null, 0);
		o.remove(0);
		o.remove((java.awt.Component) null);
		o.list((java.io.PrintStream) null, 0);
		o.list((java.io.PrintWriter) null, 0);
		o.print((java.awt.Graphics) null);
		o.removeAll();
		o.update((java.awt.Graphics) null);
		o.addPropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.setLayout((java.awt.LayoutManager) null);
		o.validate();
		o.setFont((java.awt.Font) null);
		o.invalidate();
		o.addContainerListener((java.awt.event.ContainerListener) null);
		o.addNotify();
		o.applyComponentOrientation((java.awt.ComponentOrientation) null);
		o.areFocusTraversalKeysSet(0);
		o.countComponents();
		o.deliverEvent((java.awt.Event) null);
		o.doLayout();
		o.findComponentAt(0, 0);
		o.findComponentAt((java.awt.Point) null);
		o.getAlignmentX();
		o.getAlignmentY();
		o.getComponent(0);
		o.getComponentAt(0, 0);
		o.getComponentAt((java.awt.Point) null);
		o.getComponentCount();
		o.getComponentZOrder((java.awt.Component) null);
		o.getComponents();
		o.getContainerListeners();
		o.getFocusTraversalKeys(0);
		o.getFocusTraversalPolicy();
		o.getInsets();
		o.getLayout();
		o.getListeners((java.lang.Class) null);
		o.getMaximumSize();
		o.getMinimumSize();
		o.getMousePosition(false);
		o.insets();
		o.isAncestorOf((java.awt.Component) null);
		o.isFocusCycleRoot((java.awt.Container) null);
		o.isFocusCycleRoot();
		o.isFocusTraversalPolicyProvider();
		o.isFocusTraversalPolicySet();
		o.layout();
		o.locate(0, 0);
		o.minimumSize();
		o.paint((java.awt.Graphics) null);
		o.paintComponents((java.awt.Graphics) null);
		o.preferredSize();
		o.printComponents((java.awt.Graphics) null);
		o.removeContainerListener((java.awt.event.ContainerListener) null);
		o.removeNotify();
		o.setComponentZOrder((java.awt.Component) null, 0);
		o.setFocusCycleRoot(false);
		o.setFocusTraversalKeys(0, (java.util.Set) null);
		o.setFocusTraversalPolicy((java.awt.FocusTraversalPolicy) null);
		o.setFocusTraversalPolicyProvider(false);
		o.transferFocusBackward();
		o.transferFocusDownCycle();
		o.add((java.awt.PopupMenu) null);
		o.getName();
		o.toString();
		o.contains(0, 0);
		o.contains((java.awt.Point) null);
		o.size();
		o.getLocation();
		o.getLocation((java.awt.Point) null);
		o.getParent();
		o.remove((java.awt.MenuComponent) null);
		o.setName((java.lang.String) null);
		o.list();
		o.list((java.io.PrintStream) null);
		o.list((java.io.PrintWriter) null);
		o.getSize();
		o.getSize((java.awt.Dimension) null);
		o.setSize(0, 0);
		o.setSize((java.awt.Dimension) null);
		o.resize(0, 0);
		o.resize((java.awt.Dimension) null);
		o.isOpaque();
		o.disable();
		o.enable();
		o.enable(false);
		o.location();
		o.isValid();
		o.createImage((java.awt.image.ImageProducer) null);
		o.createImage(0, 0);
		o.isVisible();
		o.setBounds((java.awt.Rectangle) null);
		o.removePropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.setVisible(false);
		o.addComponentListener((java.awt.event.ComponentListener) null);
		o.firePropertyChange((java.lang.String) null, (byte) 0, (byte) 0);
		o.firePropertyChange((java.lang.String) null, (char) 0, (char) 0);
		o.firePropertyChange((java.lang.String) null, (short) 0, (short) 0);
		o.firePropertyChange((java.lang.String) null, 0L, 0L);
		o.firePropertyChange((java.lang.String) null, 0.f, 0.f);
		o.firePropertyChange((java.lang.String) null, 0.0, 0.0);
		o.getFont();
		o.addMouseListener((java.awt.event.MouseListener) null);
		o.removeMouseListener((java.awt.event.MouseListener) null);
		o.setBackground((java.awt.Color) null);
		o.setForeground((java.awt.Color) null);
		o.setEnabled(false);
		o.getBounds();
		o.getBounds((java.awt.Rectangle) null);
		o.getBackground();
		o.getForeground();
		o.isEnabled();
		o.setLocation(0, 0);
		o.setLocation((java.awt.Point) null);
		o.dispatchEvent((java.awt.AWTEvent) null);
		o.getAccessibleContext();
		o.getFocusCycleRootAncestor();
		o.getGraphicsConfiguration();
		o.getMousePosition();
		o.getPeer();
		o.getTreeLock();
		o.handleEvent((java.awt.Event) null);
		o.isDisplayable();
		o.isFocusOwner();
		o.isFocusable();
		o.isLightweight();
		o.isMaximumSizeSet();
		o.isMinimumSizeSet();
		o.isPreferredSizeSet();
		o.isShowing();
		o.postEvent((java.awt.Event) null);
		o.requestFocus();
		o.transferFocus();
		o.action((java.awt.Event) null, (java.lang.Object) null);
		o.addFocusListener((java.awt.event.FocusListener) null);
		o.addHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.addHierarchyListener((java.awt.event.HierarchyListener) null);
		o.addInputMethodListener((java.awt.event.InputMethodListener) null);
		o.addKeyListener((java.awt.event.KeyListener) null);
		o.addMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.addMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.bounds();
		o.checkImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.checkImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.createVolatileImage(0, 0);
		o.createVolatileImage(0, 0, (java.awt.ImageCapabilities) null);
		o.enableInputMethods(false);
		o.getColorModel();
		o.getComponentListeners();
		o.getComponentOrientation();
		o.getCursor();
		o.getDropTarget();
		o.getFocusListeners();
		o.getFocusTraversalKeysEnabled();
		o.getFontMetrics((java.awt.Font) null);
		o.getGraphics();
		o.getHeight();
		o.getHierarchyBoundsListeners();
		o.getHierarchyListeners();
		o.getIgnoreRepaint();
		o.getInputContext();
		o.getInputMethodListeners();
		o.getInputMethodRequests();
		o.getKeyListeners();
		o.getLocale();
		o.getLocationOnScreen();
		o.getMouseListeners();
		o.getMouseMotionListeners();
		o.getMouseWheelListeners();
		o.getPropertyChangeListeners();
		o.getPropertyChangeListeners((java.lang.String) null);
		o.getToolkit();
		o.getWidth();
		o.getX();
		o.getY();
		o.gotFocus((java.awt.Event) null, (java.lang.Object) null);
		o.hasFocus();
		o.hide();
		o.imageUpdate((java.awt.Image) null, 0, 0, 0, 0, 0);
		o.inside(0, 0);
		o.isBackgroundSet();
		o.isCursorSet();
		o.isDoubleBuffered();
		o.isFocusTraversable();
		o.isFontSet();
		o.isForegroundSet();
		o.keyDown((java.awt.Event) null, 0);
		o.keyUp((java.awt.Event) null, 0);
		o.lostFocus((java.awt.Event) null, (java.lang.Object) null);
		o.mouseDown((java.awt.Event) null, 0, 0);
		o.mouseDrag((java.awt.Event) null, 0, 0);
		o.mouseEnter((java.awt.Event) null, 0, 0);
		o.mouseExit((java.awt.Event) null, 0, 0);
		o.mouseMove((java.awt.Event) null, 0, 0);
		o.mouseUp((java.awt.Event) null, 0, 0);
		o.move(0, 0);
		o.nextFocus();
		o.paintAll((java.awt.Graphics) null);
		o.prepareImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.prepareImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.printAll((java.awt.Graphics) null);
		o.removeComponentListener((java.awt.event.ComponentListener) null);
		o.removeFocusListener((java.awt.event.FocusListener) null);
		o.removeHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.removeHierarchyListener((java.awt.event.HierarchyListener) null);
		o.removeInputMethodListener((java.awt.event.InputMethodListener) null);
		o.removeKeyListener((java.awt.event.KeyListener) null);
		o.removeMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.removeMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.repaint();
		o.repaint(0L);
		o.repaint(0, 0, 0, 0);
		o.repaint(0L, 0, 0, 0, 0);
		o.requestFocusInWindow();
		o.reshape(0, 0, 0, 0);
		o.setComponentOrientation((java.awt.ComponentOrientation) null);
		o.setCursor((java.awt.Cursor) null);
		o.setDropTarget((java.awt.dnd.DropTarget) null);
		o.setFocusTraversalKeysEnabled(false);
		o.setFocusable(false);
		o.setIgnoreRepaint(false);
		o.setLocale((java.util.Locale) null);
		o.setMaximumSize((java.awt.Dimension) null);
		o.setMinimumSize((java.awt.Dimension) null);
		o.setPreferredSize((java.awt.Dimension) null);
		o.show();
		o.show(false);
		o.transferFocusUpCycle();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayer o = null;
		new javax.media.bean.playerbean.MediaPlayer();
		}
	}
	public void test_javax_media_BadHeaderException() throws Exception
	{
		assertEquals(javax.media.BadHeaderException.class.getModifiers(), 1);
		assertTrue(!javax.media.BadHeaderException.class.isInterface());
		assertTrue(javax.media.BadHeaderException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.BadHeaderException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.BadHeaderException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.BadHeaderException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.BadHeaderException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.BadHeaderException o = null;
		new javax.media.BadHeaderException();
		new javax.media.BadHeaderException((java.lang.String) null);
		}
	}
	public void test_javax_media_Format() throws Exception
	{
		assertEquals(javax.media.Format.class.getModifiers(), 1);
		assertTrue(!javax.media.Format.class.isInterface());
		assertTrue(java.lang.Cloneable.class.isAssignableFrom(javax.media.Format.class));
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.Format.class));
		assertTrue(javax.media.Format.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.Format.NOT_SPECIFIED == -1);
		assertTrue(javax.media.Format.TRUE == 1);
		assertTrue(javax.media.Format.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.Format.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.Format.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.Format.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Format.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Format.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Format.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.Format.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.Format.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.Format.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.Format.class.getConstructor(new Class[]{java.lang.String.class, java.lang.Class.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.Format.class.getDeclaredField("NOT_SPECIFIED");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("TRUE");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("FALSE");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("encoding");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("intArray");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("shortArray");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("byteArray");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("formatArray");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("dataType");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("clz");
			assertEquals(f.getType().getName(), "java.lang.Class");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.Format.class.getDeclaredField("encodingCode");
			assertEquals(f.getType().getName(), "long");
			assertEquals(f.getModifiers(), 2);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.Format o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.getEncoding();
		o.intersects((javax.media.Format) null);
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.relax();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.Format o = null;
		new javax.media.Format((java.lang.String) null);
		new javax.media.Format((java.lang.String) null, (java.lang.Class) null);
		}
	}
	public void test_javax_media_rtp_SessionAddress() throws Exception
	{
		if (true)
			return;	// TODO: RTP not properly stubbed or implemented.

		assertEquals(javax.media.rtp.SessionAddress.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.SessionAddress.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.rtp.SessionAddress.class));
		assertTrue(javax.media.rtp.SessionAddress.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.rtp.SessionAddress.ANY_PORT == -1);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getTimeToLive", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getDataAddress", new Class[]{});
			assertEquals(m.getReturnType(), java.net.InetAddress.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("setDataHostAddress", new Class[]{java.net.InetAddress.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("setDataPort", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getDataHostAddress", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getDataPort", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getControlAddress", new Class[]{});
			assertEquals(m.getReturnType(), java.net.InetAddress.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("setControlHostAddress", new Class[]{java.net.InetAddress.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("setControlPort", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getControlHostAddress", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getControlPort", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.SessionAddress.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.SessionAddress.class.getConstructor(new Class[]{java.net.InetAddress.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.SessionAddress.class.getConstructor(new Class[]{java.net.InetAddress.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.SessionAddress.class.getConstructor(new Class[]{java.net.InetAddress.class, int.class, java.net.InetAddress.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.rtp.SessionAddress.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("m_dataAddress");
			assertEquals(f.getType().getName(), "java.net.InetAddress");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("m_controlAddress");
			assertEquals(f.getType().getName(), "java.net.InetAddress");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("m_dataPort");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("m_controlPort");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("ttl");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.rtp.SessionAddress.class.getDeclaredField("ANY_PORT");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.SessionAddress o = null;
		o.hashCode();
		o.equals((java.lang.Object) null);
		o.toString();
		o.getTimeToLive();
		o.getDataAddress();
		o.setDataHostAddress((java.net.InetAddress) null);
		o.setDataPort(0);
		o.getDataHostAddress();
		o.getDataPort();
		o.getControlAddress();
		o.setControlHostAddress((java.net.InetAddress) null);
		o.setControlPort(0);
		o.getControlHostAddress();
		o.getControlPort();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.SessionAddress o = null;
		new javax.media.rtp.SessionAddress((java.net.InetAddress) null, 0);
		new javax.media.rtp.SessionAddress((java.net.InetAddress) null, 0, 0);
		new javax.media.rtp.SessionAddress((java.net.InetAddress) null, 0, (java.net.InetAddress) null, 0);
		new javax.media.rtp.SessionAddress();
		}
	}
	public void test_javax_media_rtp_event_RemotePayloadChangeEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.RemotePayloadChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.RemotePayloadChangeEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.RemotePayloadChangeEvent.class.getSuperclass().equals(javax.media.rtp.event.ReceiveStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getNewPayload", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemotePayloadChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.RemotePayloadChangeEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.ReceiveStream.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.RemotePayloadChangeEvent o = null;
		o.getNewPayload();
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.RemotePayloadChangeEvent o = null;
		new javax.media.rtp.event.RemotePayloadChangeEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.ReceiveStream) null, 0, 0);
		}
	}
	public void test_javax_media_format_H261Format() throws Exception
	{
		assertEquals(javax.media.format.H261Format.class.getModifiers(), 1);
		assertTrue(!javax.media.format.H261Format.class.isInterface());
		assertTrue(javax.media.format.H261Format.class.getSuperclass().equals(javax.media.format.VideoFormat.class));
		// Static fields: 
		assertTrue(javax.media.format.H261Format.CINEPAK.equals("cvid"));
		assertTrue(javax.media.format.H261Format.JPEG.equals("jpeg"));
		assertTrue(javax.media.format.H261Format.JPEG_RTP.equals("jpeg/rtp"));
		assertTrue(javax.media.format.H261Format.MPEG.equals("mpeg"));
		assertTrue(javax.media.format.H261Format.MPEG_RTP.equals("mpeg/rtp"));
		assertTrue(javax.media.format.H261Format.H261.equals("h261"));
		assertTrue(javax.media.format.H261Format.H261_RTP.equals("h261/rtp"));
		assertTrue(javax.media.format.H261Format.H263.equals("h263"));
		assertTrue(javax.media.format.H261Format.H263_RTP.equals("h263/rtp"));
		assertTrue(javax.media.format.H261Format.H263_1998_RTP.equals("h263-1998/rtp"));
		assertTrue(javax.media.format.H261Format.RGB.equals("rgb"));
		assertTrue(javax.media.format.H261Format.YUV.equals("yuv"));
		assertTrue(javax.media.format.H261Format.IRGB.equals("irgb"));
		assertTrue(javax.media.format.H261Format.SMC.equals("smc"));
		assertTrue(javax.media.format.H261Format.RLE.equals("rle"));
		assertTrue(javax.media.format.H261Format.RPZA.equals("rpza"));
		assertTrue(javax.media.format.H261Format.MJPG.equals("mjpg"));
		assertTrue(javax.media.format.H261Format.MJPEGA.equals("mjpa"));
		assertTrue(javax.media.format.H261Format.MJPEGB.equals("mjpb"));
		assertTrue(javax.media.format.H261Format.INDEO32.equals("iv32"));
		assertTrue(javax.media.format.H261Format.INDEO41.equals("iv41"));
		assertTrue(javax.media.format.H261Format.INDEO50.equals("iv50"));
		assertTrue(javax.media.format.H261Format.NOT_SPECIFIED == -1);
		assertTrue(javax.media.format.H261Format.TRUE == 1);
		assertTrue(javax.media.format.H261Format.FALSE == 0);
		// TODO: test intArray of type java.lang.Class
		// TODO: test shortArray of type java.lang.Class
		// TODO: test byteArray of type java.lang.Class
		// TODO: test formatArray of type java.lang.Class

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.H261Format.class.getMethod("clone", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("matches", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("intersects", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getStillImageTransmission", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getFrameRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("relax", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getMaxDataLength", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getEncoding", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getDataType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("isSameEncoding", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("isSameEncoding", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.H261Format.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.H261Format.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.H261Format.class.getConstructor(new Class[]{java.awt.Dimension.class, int.class, java.lang.Class.class, float.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.format.H261Format.class.getDeclaredField("stillImageTransmission");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 4);
		}
		{
			final Field f = javax.media.format.H261Format.class.getDeclaredField("ENCODING");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 10);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.H261Format o = null;
		o.clone();
		o.equals((java.lang.Object) null);
		o.toString();
		o.matches((javax.media.Format) null);
		o.intersects((javax.media.Format) null);
		o.getStillImageTransmission();
		o.getSize();
		o.getFrameRate();
		o.relax();
		o.getMaxDataLength();
		o.getEncoding();
		o.getDataType();
		o.isSameEncoding((javax.media.Format) null);
		o.isSameEncoding((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.H261Format o = null;
		new javax.media.format.H261Format();
		new javax.media.format.H261Format((java.awt.Dimension) null, 0, (java.lang.Class) null, 0.f, 0);
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerResource() throws Exception
	{
		assertEquals(javax.media.bean.playerbean.MediaPlayerResource.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerResource.class.isInterface());
		assertTrue(javax.media.bean.playerbean.MediaPlayerResource.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		// TODO: test resourceBundle of type java.util.ResourceBundle

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("getString", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerResource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerResource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerResource.class.getDeclaredField("resourceBundle");
			assertEquals(f.getType().getName(), "java.util.ResourceBundle");
			assertEquals(f.getModifiers(), 9);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerResource o = null;
		javax.media.bean.playerbean.MediaPlayerResource.getString((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerResource o = null;
		new javax.media.bean.playerbean.MediaPlayerResource();
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerMediaLocationEditor() throws Exception
	{
		if (true)
			return;	// TODO: GUI classes not properly stubbed or implemented.

		assertEquals(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.isInterface());
		assertTrue(java.beans.PropertyEditor.class.isAssignableFrom(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class));
		assertTrue(java.awt.event.ActionListener.class.isAssignableFrom(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class));
		assertTrue(java.awt.event.ItemListener.class.isAssignableFrom(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class));
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getSuperclass().equals(java.awt.Panel.class));
		// Static fields: 
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.TOP_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.CENTER_ALIGNMENT == 0.5f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.BOTTOM_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.LEFT_ALIGNMENT == 0.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.RIGHT_ALIGNMENT == 1.0f);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.WIDTH == 1);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.HEIGHT == 2);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.PROPERTIES == 4);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.SOMEBITS == 8);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.FRAMEBITS == 16);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.ALLBITS == 32);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.ERROR == 64);
		assertTrue(javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.ABORT == 128);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getValue", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setValue", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getPreferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addPropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removePropertyChangeListener", new Class[]{java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getJavaInitializationString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setAsText", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getAsText", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isPaintable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("paintValue", new Class[]{java.awt.Graphics.class, java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getTags", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getCustomEditor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("supportsCustomEditor", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("actionPerformed", new Class[]{java.awt.event.ActionEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("itemStateChanged", new Class[]{java.awt.event.ItemEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getAccessibleContext", new Class[]{});
			assertEquals(m.getReturnType(), javax.accessibility.AccessibleContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.lang.String.class, java.awt.Component.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.awt.Component.class, java.lang.Object.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("remove", new Class[]{int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("remove", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("list", new Class[]{java.io.PrintStream.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("list", new Class[]{java.io.PrintWriter.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("print", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("update", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addPropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setLayout", new Class[]{java.awt.LayoutManager.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("validate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFont", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("invalidate", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("applyComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("areFocusTraversalKeysSet", new Class[]{int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("countComponents", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("deliverEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("doLayout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("findComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("findComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getAlignmentX", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getAlignmentY", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponent", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentAt", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentAt", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentCount", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentZOrder", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponents", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Component[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getContainerListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ContainerListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFocusTraversalKeys", new Class[]{int.class});
			assertEquals(m.getReturnType(), java.util.Set.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFocusTraversalPolicy", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.FocusTraversalPolicy.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getInsets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getLayout", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.LayoutManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getListeners", new Class[]{java.lang.Class.class});
			assertEquals(m.getReturnType(), java.util.EventListener[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMaximumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMinimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMousePosition", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("insets", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Insets.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isAncestorOf", new Class[]{java.awt.Component.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusCycleRoot", new Class[]{java.awt.Container.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusCycleRoot", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusTraversalPolicyProvider", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusTraversalPolicySet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("layout", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("locate", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Component.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("minimumSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("paint", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("paintComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("preferredSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("printComponents", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeContainerListener", new Class[]{java.awt.event.ContainerListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeNotify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setComponentZOrder", new Class[]{java.awt.Component.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusCycleRoot", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusTraversalKeys", new Class[]{int.class, java.util.Set.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusTraversalPolicy", new Class[]{java.awt.FocusTraversalPolicy.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusTraversalPolicyProvider", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("transferFocusBackward", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("transferFocusDownCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("add", new Class[]{java.awt.PopupMenu.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getName", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("contains", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("contains", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("size", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getLocation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getParent", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("remove", new Class[]{java.awt.MenuComponent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setName", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("list", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("list", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("list", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getSize", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), java.awt.Dimension.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setSize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("resize", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("resize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isOpaque", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("disable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("enable", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("enable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("location", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isValid", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("createImage", new Class[]{java.awt.image.ImageProducer.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("createImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.Image.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isVisible", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setBounds", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removePropertyChangeListener", new Class[]{java.lang.String.class, java.beans.PropertyChangeListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setVisible", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, byte.class, byte.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, char.class, char.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, short.class, short.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, long.class, long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, float.class, float.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("firePropertyChange", new Class[]{java.lang.String.class, double.class, double.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFont", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Font.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeMouseListener", new Class[]{java.awt.event.MouseListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setBackground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setForeground", new Class[]{java.awt.Color.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getBounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getBounds", new Class[]{java.awt.Rectangle.class});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getBackground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getForeground", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Color.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setLocation", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setLocation", new Class[]{java.awt.Point.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("dispatchEvent", new Class[]{java.awt.AWTEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFocusCycleRootAncestor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Container.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getGraphicsConfiguration", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.GraphicsConfiguration.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMousePosition", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getPeer", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.peer.ComponentPeer.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getTreeLock", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("handleEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isDisplayable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusOwner", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isLightweight", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isMaximumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isMinimumSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isPreferredSizeSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isShowing", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("postEvent", new Class[]{java.awt.Event.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("requestFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("transferFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("action", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("addMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("bounds", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Rectangle.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("checkImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("checkImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("createVolatileImage", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("createVolatileImage", new Class[]{int.class, int.class, java.awt.ImageCapabilities.class});
			assertEquals(m.getReturnType(), java.awt.image.VolatileImage.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("enableInputMethods", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getColorModel", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.image.ColorModel.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.ComponentListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getComponentOrientation", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.ComponentOrientation.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getCursor", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Cursor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getDropTarget", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.dnd.DropTarget.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFocusListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.FocusListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFocusTraversalKeysEnabled", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getFontMetrics", new Class[]{java.awt.Font.class});
			assertEquals(m.getReturnType(), java.awt.FontMetrics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getGraphics", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Graphics.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getHeight", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getHierarchyBoundsListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyBoundsListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getHierarchyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.HierarchyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getIgnoreRepaint", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getInputContext", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputContext.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getInputMethodListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.InputMethodListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getInputMethodRequests", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.im.InputMethodRequests.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getKeyListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.KeyListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getLocale", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Locale.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getLocationOnScreen", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Point.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMouseListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMouseMotionListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseMotionListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getMouseWheelListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.event.MouseWheelListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getPropertyChangeListeners", new Class[]{});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getPropertyChangeListeners", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.beans.PropertyChangeListener[].class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getToolkit", new Class[]{});
			assertEquals(m.getReturnType(), java.awt.Toolkit.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getWidth", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getX", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getY", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("gotFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("hasFocus", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("hide", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("imageUpdate", new Class[]{java.awt.Image.class, int.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("inside", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isBackgroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isCursorSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isDoubleBuffered", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFocusTraversable", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isFontSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("isForegroundSet", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("keyDown", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("keyUp", new Class[]{java.awt.Event.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("lostFocus", new Class[]{java.awt.Event.class, java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseDown", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseDrag", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseEnter", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseExit", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseMove", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("mouseUp", new Class[]{java.awt.Event.class, int.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("move", new Class[]{int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("nextFocus", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("paintAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("prepareImage", new Class[]{java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("printAll", new Class[]{java.awt.Graphics.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeComponentListener", new Class[]{java.awt.event.ComponentListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeFocusListener", new Class[]{java.awt.event.FocusListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeHierarchyBoundsListener", new Class[]{java.awt.event.HierarchyBoundsListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeHierarchyListener", new Class[]{java.awt.event.HierarchyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeInputMethodListener", new Class[]{java.awt.event.InputMethodListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeKeyListener", new Class[]{java.awt.event.KeyListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeMouseMotionListener", new Class[]{java.awt.event.MouseMotionListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("removeMouseWheelListener", new Class[]{java.awt.event.MouseWheelListener.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("repaint", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("repaint", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("repaint", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("repaint", new Class[]{long.class, int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("requestFocusInWindow", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("reshape", new Class[]{int.class, int.class, int.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setComponentOrientation", new Class[]{java.awt.ComponentOrientation.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setCursor", new Class[]{java.awt.Cursor.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setDropTarget", new Class[]{java.awt.dnd.DropTarget.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusTraversalKeysEnabled", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setFocusable", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setIgnoreRepaint", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setLocale", new Class[]{java.util.Locale.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setMaximumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setMinimumSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("setPreferredSize", new Class[]{java.awt.Dimension.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("show", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("show", new Class[]{boolean.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("transferFocusUpCycle", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("support");
			assertEquals(f.getType().getName(), "java.beans.PropertyChangeSupport");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("mediaLocationString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("mediaLocationTextField");
			assertEquals(f.getType().getName(), "java.awt.TextField");
			assertEquals(f.getModifiers(), 0);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("browseString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("browseB");
			assertEquals(f.getType().getName(), "java.awt.Button");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("protocolChooser");
			assertEquals(f.getType().getName(), "java.awt.Choice");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("httpString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("httpsString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("fileString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("rtpString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("ftpString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("codeString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("chooseOneString");
			assertEquals(f.getType().getName(), "java.lang.String");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("isFile");
			assertEquals(f.getType().getName(), "boolean");
			assertEquals(f.getModifiers(), 2);
		}
		{
			final Field f = javax.media.bean.playerbean.MediaPlayerMediaLocationEditor.class.getDeclaredField("editPanel");
			assertEquals(f.getType().getName(), "java.awt.Panel");
			assertEquals(f.getModifiers(), 0);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerMediaLocationEditor o = null;
		o.getValue();
		o.setValue((java.lang.Object) null);
		o.getPreferredSize();
		o.addPropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.removePropertyChangeListener((java.beans.PropertyChangeListener) null);
		o.getJavaInitializationString();
		o.setAsText((java.lang.String) null);
		o.getAsText();
		o.isPaintable();
		o.paintValue((java.awt.Graphics) null, (java.awt.Rectangle) null);
		o.getTags();
		o.getCustomEditor();
		o.supportsCustomEditor();
		o.actionPerformed((java.awt.event.ActionEvent) null);
		o.itemStateChanged((java.awt.event.ItemEvent) null);
		o.addNotify();
		o.getAccessibleContext();
		o.add((java.awt.Component) null);
		o.add((java.lang.String) null, (java.awt.Component) null);
		o.add((java.awt.Component) null, 0);
		o.add((java.awt.Component) null, (java.lang.Object) null);
		o.add((java.awt.Component) null, (java.lang.Object) null, 0);
		o.remove(0);
		o.remove((java.awt.Component) null);
		o.list((java.io.PrintStream) null, 0);
		o.list((java.io.PrintWriter) null, 0);
		o.print((java.awt.Graphics) null);
		o.removeAll();
		o.update((java.awt.Graphics) null);
		o.addPropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.setLayout((java.awt.LayoutManager) null);
		o.validate();
		o.setFont((java.awt.Font) null);
		o.invalidate();
		o.addContainerListener((java.awt.event.ContainerListener) null);
		o.applyComponentOrientation((java.awt.ComponentOrientation) null);
		o.areFocusTraversalKeysSet(0);
		o.countComponents();
		o.deliverEvent((java.awt.Event) null);
		o.doLayout();
		o.findComponentAt(0, 0);
		o.findComponentAt((java.awt.Point) null);
		o.getAlignmentX();
		o.getAlignmentY();
		o.getComponent(0);
		o.getComponentAt(0, 0);
		o.getComponentAt((java.awt.Point) null);
		o.getComponentCount();
		o.getComponentZOrder((java.awt.Component) null);
		o.getComponents();
		o.getContainerListeners();
		o.getFocusTraversalKeys(0);
		o.getFocusTraversalPolicy();
		o.getInsets();
		o.getLayout();
		o.getListeners((java.lang.Class) null);
		o.getMaximumSize();
		o.getMinimumSize();
		o.getMousePosition(false);
		o.insets();
		o.isAncestorOf((java.awt.Component) null);
		o.isFocusCycleRoot((java.awt.Container) null);
		o.isFocusCycleRoot();
		o.isFocusTraversalPolicyProvider();
		o.isFocusTraversalPolicySet();
		o.layout();
		o.locate(0, 0);
		o.minimumSize();
		o.paint((java.awt.Graphics) null);
		o.paintComponents((java.awt.Graphics) null);
		o.preferredSize();
		o.printComponents((java.awt.Graphics) null);
		o.removeContainerListener((java.awt.event.ContainerListener) null);
		o.removeNotify();
		o.setComponentZOrder((java.awt.Component) null, 0);
		o.setFocusCycleRoot(false);
		o.setFocusTraversalKeys(0, (java.util.Set) null);
		o.setFocusTraversalPolicy((java.awt.FocusTraversalPolicy) null);
		o.setFocusTraversalPolicyProvider(false);
		o.transferFocusBackward();
		o.transferFocusDownCycle();
		o.add((java.awt.PopupMenu) null);
		o.getName();
		o.toString();
		o.contains(0, 0);
		o.contains((java.awt.Point) null);
		o.size();
		o.getLocation();
		o.getLocation((java.awt.Point) null);
		o.getParent();
		o.remove((java.awt.MenuComponent) null);
		o.setName((java.lang.String) null);
		o.list();
		o.list((java.io.PrintStream) null);
		o.list((java.io.PrintWriter) null);
		o.getSize();
		o.getSize((java.awt.Dimension) null);
		o.setSize(0, 0);
		o.setSize((java.awt.Dimension) null);
		o.resize(0, 0);
		o.resize((java.awt.Dimension) null);
		o.isOpaque();
		o.disable();
		o.enable();
		o.enable(false);
		o.location();
		o.isValid();
		o.createImage((java.awt.image.ImageProducer) null);
		o.createImage(0, 0);
		o.isVisible();
		o.setBounds(0, 0, 0, 0);
		o.setBounds((java.awt.Rectangle) null);
		o.removePropertyChangeListener((java.lang.String) null, (java.beans.PropertyChangeListener) null);
		o.setVisible(false);
		o.addComponentListener((java.awt.event.ComponentListener) null);
		o.firePropertyChange((java.lang.String) null, (byte) 0, (byte) 0);
		o.firePropertyChange((java.lang.String) null, (char) 0, (char) 0);
		o.firePropertyChange((java.lang.String) null, (short) 0, (short) 0);
		o.firePropertyChange((java.lang.String) null, 0L, 0L);
		o.firePropertyChange((java.lang.String) null, 0.f, 0.f);
		o.firePropertyChange((java.lang.String) null, 0.0, 0.0);
		o.getFont();
		o.addMouseListener((java.awt.event.MouseListener) null);
		o.removeMouseListener((java.awt.event.MouseListener) null);
		o.setBackground((java.awt.Color) null);
		o.setForeground((java.awt.Color) null);
		o.setEnabled(false);
		o.getBounds();
		o.getBounds((java.awt.Rectangle) null);
		o.getBackground();
		o.getForeground();
		o.isEnabled();
		o.setLocation(0, 0);
		o.setLocation((java.awt.Point) null);
		o.dispatchEvent((java.awt.AWTEvent) null);
		o.getFocusCycleRootAncestor();
		o.getGraphicsConfiguration();
		o.getMousePosition();
		o.getPeer();
		o.getTreeLock();
		o.handleEvent((java.awt.Event) null);
		o.isDisplayable();
		o.isFocusOwner();
		o.isFocusable();
		o.isLightweight();
		o.isMaximumSizeSet();
		o.isMinimumSizeSet();
		o.isPreferredSizeSet();
		o.isShowing();
		o.postEvent((java.awt.Event) null);
		o.requestFocus();
		o.transferFocus();
		o.action((java.awt.Event) null, (java.lang.Object) null);
		o.addFocusListener((java.awt.event.FocusListener) null);
		o.addHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.addHierarchyListener((java.awt.event.HierarchyListener) null);
		o.addInputMethodListener((java.awt.event.InputMethodListener) null);
		o.addKeyListener((java.awt.event.KeyListener) null);
		o.addMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.addMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.bounds();
		o.checkImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.checkImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.createVolatileImage(0, 0);
		o.createVolatileImage(0, 0, (java.awt.ImageCapabilities) null);
		o.enableInputMethods(false);
		o.getColorModel();
		o.getComponentListeners();
		o.getComponentOrientation();
		o.getCursor();
		o.getDropTarget();
		o.getFocusListeners();
		o.getFocusTraversalKeysEnabled();
		o.getFontMetrics((java.awt.Font) null);
		o.getGraphics();
		o.getHeight();
		o.getHierarchyBoundsListeners();
		o.getHierarchyListeners();
		o.getIgnoreRepaint();
		o.getInputContext();
		o.getInputMethodListeners();
		o.getInputMethodRequests();
		o.getKeyListeners();
		o.getLocale();
		o.getLocationOnScreen();
		o.getMouseListeners();
		o.getMouseMotionListeners();
		o.getMouseWheelListeners();
		o.getPropertyChangeListeners();
		o.getPropertyChangeListeners((java.lang.String) null);
		o.getToolkit();
		o.getWidth();
		o.getX();
		o.getY();
		o.gotFocus((java.awt.Event) null, (java.lang.Object) null);
		o.hasFocus();
		o.hide();
		o.imageUpdate((java.awt.Image) null, 0, 0, 0, 0, 0);
		o.inside(0, 0);
		o.isBackgroundSet();
		o.isCursorSet();
		o.isDoubleBuffered();
		o.isFocusTraversable();
		o.isFontSet();
		o.isForegroundSet();
		o.keyDown((java.awt.Event) null, 0);
		o.keyUp((java.awt.Event) null, 0);
		o.lostFocus((java.awt.Event) null, (java.lang.Object) null);
		o.mouseDown((java.awt.Event) null, 0, 0);
		o.mouseDrag((java.awt.Event) null, 0, 0);
		o.mouseEnter((java.awt.Event) null, 0, 0);
		o.mouseExit((java.awt.Event) null, 0, 0);
		o.mouseMove((java.awt.Event) null, 0, 0);
		o.mouseUp((java.awt.Event) null, 0, 0);
		o.move(0, 0);
		o.nextFocus();
		o.paintAll((java.awt.Graphics) null);
		o.prepareImage((java.awt.Image) null, (java.awt.image.ImageObserver) null);
		o.prepareImage((java.awt.Image) null, 0, 0, (java.awt.image.ImageObserver) null);
		o.printAll((java.awt.Graphics) null);
		o.removeComponentListener((java.awt.event.ComponentListener) null);
		o.removeFocusListener((java.awt.event.FocusListener) null);
		o.removeHierarchyBoundsListener((java.awt.event.HierarchyBoundsListener) null);
		o.removeHierarchyListener((java.awt.event.HierarchyListener) null);
		o.removeInputMethodListener((java.awt.event.InputMethodListener) null);
		o.removeKeyListener((java.awt.event.KeyListener) null);
		o.removeMouseMotionListener((java.awt.event.MouseMotionListener) null);
		o.removeMouseWheelListener((java.awt.event.MouseWheelListener) null);
		o.repaint();
		o.repaint(0L);
		o.repaint(0, 0, 0, 0);
		o.repaint(0L, 0, 0, 0, 0);
		o.requestFocusInWindow();
		o.reshape(0, 0, 0, 0);
		o.setComponentOrientation((java.awt.ComponentOrientation) null);
		o.setCursor((java.awt.Cursor) null);
		o.setDropTarget((java.awt.dnd.DropTarget) null);
		o.setFocusTraversalKeysEnabled(false);
		o.setFocusable(false);
		o.setIgnoreRepaint(false);
		o.setLocale((java.util.Locale) null);
		o.setMaximumSize((java.awt.Dimension) null);
		o.setMinimumSize((java.awt.Dimension) null);
		o.setPreferredSize((java.awt.Dimension) null);
		o.show();
		o.show(false);
		o.transferFocusUpCycle();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerMediaLocationEditor o = null;
		new javax.media.bean.playerbean.MediaPlayerMediaLocationEditor();
		}
	}
	public void test_javax_media_PlugInManager() throws Exception
	{
		assertEquals(javax.media.PlugInManager.class.getModifiers(), 1);
		assertTrue(!javax.media.PlugInManager.class.isInterface());
		assertTrue(javax.media.PlugInManager.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.PlugInManager.DEMULTIPLEXER == 1);
		assertTrue(javax.media.PlugInManager.CODEC == 2);
		assertTrue(javax.media.PlugInManager.EFFECT == 3);
		assertTrue(javax.media.PlugInManager.RENDERER == 4);
		assertTrue(javax.media.PlugInManager.MULTIPLEXER == 5);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.PlugInManager.class.getMethod("getPlugInList", new Class[]{javax.media.Format.class, javax.media.Format.class, int.class});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("getSupportedOutputFormats", new Class[]{java.lang.String.class, int.class});
			assertEquals(m.getReturnType(), javax.media.Format[].class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("commit", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("setPlugInList", new Class[]{java.util.Vector.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("addPlugIn", new Class[]{java.lang.String.class, javax.media.Format[].class, javax.media.Format[].class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("removePlugIn", new Class[]{java.lang.String.class, int.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("getSupportedInputFormats", new Class[]{java.lang.String.class, int.class});
			assertEquals(m.getReturnType(), javax.media.Format[].class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.PlugInManager.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.PlugInManager.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		{
			final Field f = javax.media.PlugInManager.class.getDeclaredField("DEMULTIPLEXER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.PlugInManager.class.getDeclaredField("CODEC");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.PlugInManager.class.getDeclaredField("EFFECT");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.PlugInManager.class.getDeclaredField("RENDERER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		{
			final Field f = javax.media.PlugInManager.class.getDeclaredField("MULTIPLEXER");
			assertEquals(f.getType().getName(), "int");
			assertEquals(f.getModifiers(), 25);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.PlugInManager o = null;
		javax.media.PlugInManager.getPlugInList((javax.media.Format) null, (javax.media.Format) null, 0);
		javax.media.PlugInManager.getSupportedOutputFormats((java.lang.String) null, 0);
		javax.media.PlugInManager.commit();
		javax.media.PlugInManager.setPlugInList((java.util.Vector) null, 0);
		javax.media.PlugInManager.addPlugIn((java.lang.String) null, (javax.media.Format[]) null, (javax.media.Format[]) null, 0);
		javax.media.PlugInManager.removePlugIn((java.lang.String) null, 0);
		javax.media.PlugInManager.getSupportedInputFormats((java.lang.String) null, 0);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.PlugInManager o = null;
		new javax.media.PlugInManager();
		}
	}
	public void test_javax_media_rtp_event_RemoteCollisionEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.RemoteCollisionEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.RemoteCollisionEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.RemoteCollisionEvent.class.getSuperclass().equals(javax.media.rtp.event.RemoteEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("getSSRC", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteCollisionEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.RemoteCollisionEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, long.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.RemoteCollisionEvent o = null;
		o.getSSRC();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.RemoteCollisionEvent o = null;
		new javax.media.rtp.event.RemoteCollisionEvent((javax.media.rtp.SessionManager) null, 0L);
		}
	}
	public void test_javax_media_DataStarvedEvent() throws Exception
	{
		assertEquals(javax.media.DataStarvedEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.DataStarvedEvent.class.isInterface());
		assertTrue(javax.media.DataStarvedEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.DataStarvedEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.DataStarvedEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.DataStarvedEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.DataStarvedEvent o = null;
		new javax.media.DataStarvedEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_protocol_PushDataSource() throws Exception
	{
		assertEquals(javax.media.protocol.PushDataSource.class.getModifiers(), 1025);
		assertTrue(!javax.media.protocol.PushDataSource.class.isInterface());
		assertTrue(javax.media.protocol.PushDataSource.class.getSuperclass().equals(javax.media.protocol.DataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushSourceStream[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.PushDataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.PushDataSource o = null;
		o.getStreams();
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getLocator();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.setLocator((javax.media.MediaLocator) null);
		o.disconnect();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_protocol_URLDataSource() throws Exception
	{
		assertEquals(javax.media.protocol.URLDataSource.class.getModifiers(), 1);
		assertTrue(!javax.media.protocol.URLDataSource.class.isInterface());
		// assertTrue(javax.media.protocol.URLDataSource.class.getSuperclass().equals(javax.media.protocol.PullDataSource.class)); // no longer true, we subclass FMJ's in FMJ.
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PullSourceStream[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.URLDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.URLDataSource.class.getConstructor(new Class[]{java.net.URL.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.URLDataSource o = null;
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.disconnect();
		o.getStreams();
		o.getLocator();
		o.setLocator((javax.media.MediaLocator) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.protocol.URLDataSource o = null;
		new javax.media.protocol.URLDataSource((java.net.URL) null);
		}
	}
	public void test_javax_media_protocol_PushBufferDataSource() throws Exception
	{
		assertEquals(javax.media.protocol.PushBufferDataSource.class.getModifiers(), 1025);
		assertTrue(!javax.media.protocol.PushBufferDataSource.class.isInterface());
		assertTrue(javax.media.protocol.PushBufferDataSource.class.getSuperclass().equals(javax.media.protocol.DataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushBufferStream[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1025);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.PushBufferDataSource.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.PushBufferDataSource.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.PushBufferDataSource o = null;
		o.getStreams();
		o.start();
		o.stop();
		o.connect();
		o.getContentType();
		o.getDuration();
		o.getLocator();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.setLocator((javax.media.MediaLocator) null);
		o.disconnect();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
	}
	public void test_javax_media_CaptureDeviceInfo() throws Exception
	{
		assertEquals(javax.media.CaptureDeviceInfo.class.getModifiers(), 1);
		assertTrue(!javax.media.CaptureDeviceInfo.class.isInterface());
		assertTrue(java.io.Serializable.class.isAssignableFrom(javax.media.CaptureDeviceInfo.class));
		assertTrue(javax.media.CaptureDeviceInfo.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("getName", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("getFormats", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceInfo.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.CaptureDeviceInfo.class.getConstructor(new Class[]{java.lang.String.class, javax.media.MediaLocator.class, javax.media.Format[].class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.CaptureDeviceInfo.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.CaptureDeviceInfo o = null;
		o.equals((java.lang.Object) null);
		o.getName();
		o.toString();
		o.getFormats();
		o.getLocator();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.CaptureDeviceInfo o = null;
		new javax.media.CaptureDeviceInfo((java.lang.String) null, (javax.media.MediaLocator) null, (javax.media.Format[]) null);
		new javax.media.CaptureDeviceInfo();
		}
	}
	public void test_javax_media_ConnectionErrorEvent() throws Exception
	{
		assertEquals(javax.media.ConnectionErrorEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ConnectionErrorEvent.class.isInterface());
		assertTrue(javax.media.ConnectionErrorEvent.class.getSuperclass().equals(javax.media.ControllerErrorEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ConnectionErrorEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ConnectionErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ConnectionErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ConnectionErrorEvent o = null;
		o.toString();
		o.getMessage();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ConnectionErrorEvent o = null;
		new javax.media.ConnectionErrorEvent((javax.media.Controller) null);
		new javax.media.ConnectionErrorEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_NotPrefetchedError() throws Exception
	{
		assertEquals(javax.media.NotPrefetchedError.class.getModifiers(), 1);
		assertTrue(!javax.media.NotPrefetchedError.class.isInterface());
		assertTrue(javax.media.NotPrefetchedError.class.getSuperclass().equals(javax.media.MediaError.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.NotPrefetchedError.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.NotPrefetchedError.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.NotPrefetchedError o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.NotPrefetchedError o = null;
		new javax.media.NotPrefetchedError((java.lang.String) null);
		}
	}
	public void test_javax_media_StopEvent() throws Exception
	{
		assertEquals(javax.media.StopEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.StopEvent.class.isInterface());
		assertTrue(javax.media.StopEvent.class.getSuperclass().equals(javax.media.TransitionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StopEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StopEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StopEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StopEvent o = null;
		new javax.media.StopEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_InternalErrorEvent() throws Exception
	{
		assertEquals(javax.media.InternalErrorEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.InternalErrorEvent.class.isInterface());
		assertTrue(javax.media.InternalErrorEvent.class.getSuperclass().equals(javax.media.ControllerErrorEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.InternalErrorEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.InternalErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.InternalErrorEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.InternalErrorEvent o = null;
		o.toString();
		o.getMessage();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.InternalErrorEvent o = null;
		new javax.media.InternalErrorEvent((javax.media.Controller) null);
		new javax.media.InternalErrorEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_ControllerAdapter() throws Exception
	{
		assertEquals(javax.media.ControllerAdapter.class.getModifiers(), 1);
		assertTrue(!javax.media.ControllerAdapter.class.isInterface());
		assertTrue(javax.media.ControllerListener.class.isAssignableFrom(javax.media.ControllerAdapter.class));
		assertTrue(java.util.EventListener.class.isAssignableFrom(javax.media.ControllerAdapter.class));
		assertTrue(javax.media.ControllerAdapter.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("start", new Class[]{javax.media.StartEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("stop", new Class[]{javax.media.StopEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("deallocate", new Class[]{javax.media.DeallocateEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("cachingControl", new Class[]{javax.media.CachingControlEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("controllerError", new Class[]{javax.media.ControllerErrorEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("dataLostError", new Class[]{javax.media.DataLostErrorEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("dataStarved", new Class[]{javax.media.DataStarvedEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("internalError", new Class[]{javax.media.InternalErrorEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("resourceUnavailable", new Class[]{javax.media.ResourceUnavailableEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("durationUpdate", new Class[]{javax.media.DurationUpdateEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("mediaTimeSet", new Class[]{javax.media.MediaTimeSetEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("rateChange", new Class[]{javax.media.RateChangeEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("stopTimeChange", new Class[]{javax.media.StopTimeChangeEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("transition", new Class[]{javax.media.TransitionEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("prefetchComplete", new Class[]{javax.media.PrefetchCompleteEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("realizeComplete", new Class[]{javax.media.RealizeCompleteEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("endOfMedia", new Class[]{javax.media.EndOfMediaEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("restarting", new Class[]{javax.media.RestartingEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("stopAtTime", new Class[]{javax.media.StopAtTimeEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("stopByRequest", new Class[]{javax.media.StopByRequestEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("audioDeviceUnavailable", new Class[]{javax.media.AudioDeviceUnavailableEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("configureComplete", new Class[]{javax.media.ConfigureCompleteEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("controllerClosed", new Class[]{javax.media.ControllerClosedEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("sizeChange", new Class[]{javax.media.SizeChangeEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("connectionError", new Class[]{javax.media.ConnectionErrorEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("formatChange", new Class[]{javax.media.format.FormatChangeEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("replaceURL", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("showDocument", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("controllerUpdate", new Class[]{javax.media.ControllerEvent.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerAdapter.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ControllerAdapter.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ControllerAdapter o = null;
		o.start((javax.media.StartEvent) null);
		o.stop((javax.media.StopEvent) null);
		o.deallocate((javax.media.DeallocateEvent) null);
		o.cachingControl((javax.media.CachingControlEvent) null);
		o.controllerError((javax.media.ControllerErrorEvent) null);
		o.dataLostError((javax.media.DataLostErrorEvent) null);
		o.dataStarved((javax.media.DataStarvedEvent) null);
		o.internalError((javax.media.InternalErrorEvent) null);
		o.resourceUnavailable((javax.media.ResourceUnavailableEvent) null);
		o.durationUpdate((javax.media.DurationUpdateEvent) null);
		o.mediaTimeSet((javax.media.MediaTimeSetEvent) null);
		o.rateChange((javax.media.RateChangeEvent) null);
		o.stopTimeChange((javax.media.StopTimeChangeEvent) null);
		o.transition((javax.media.TransitionEvent) null);
		o.prefetchComplete((javax.media.PrefetchCompleteEvent) null);
		o.realizeComplete((javax.media.RealizeCompleteEvent) null);
		o.endOfMedia((javax.media.EndOfMediaEvent) null);
		o.restarting((javax.media.RestartingEvent) null);
		o.stopAtTime((javax.media.StopAtTimeEvent) null);
		o.stopByRequest((javax.media.StopByRequestEvent) null);
		o.audioDeviceUnavailable((javax.media.AudioDeviceUnavailableEvent) null);
		o.configureComplete((javax.media.ConfigureCompleteEvent) null);
		o.controllerClosed((javax.media.ControllerClosedEvent) null);
		o.sizeChange((javax.media.SizeChangeEvent) null);
		o.connectionError((javax.media.ConnectionErrorEvent) null);
		o.formatChange((javax.media.format.FormatChangeEvent) null);
		o.replaceURL((java.lang.Object) null);
		o.showDocument((java.lang.Object) null);
		o.controllerUpdate((javax.media.ControllerEvent) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ControllerAdapter o = null;
		new javax.media.ControllerAdapter();
		}
	}
	public void test_javax_media_ControllerClosedEvent() throws Exception
	{
		assertEquals(javax.media.ControllerClosedEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.ControllerClosedEvent.class.isInterface());
		assertTrue(javax.media.ControllerClosedEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ControllerClosedEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ControllerClosedEvent.class.getConstructor(new Class[]{javax.media.Controller.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ControllerClosedEvent.class.getConstructor(new Class[]{javax.media.Controller.class, java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ControllerClosedEvent o = null;
		o.getMessage();
		o.toString();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ControllerClosedEvent o = null;
		new javax.media.ControllerClosedEvent((javax.media.Controller) null);
		new javax.media.ControllerClosedEvent((javax.media.Controller) null, (java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_ReceiverReportEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ReceiverReportEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ReceiverReportEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ReceiverReportEvent.class.getSuperclass().equals(javax.media.rtp.event.RemoteEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("getReport", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.rtcp.ReceiverReport.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiverReportEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ReceiverReportEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.rtcp.ReceiverReport.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ReceiverReportEvent o = null;
		o.getReport();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ReceiverReportEvent o = null;
		new javax.media.rtp.event.ReceiverReportEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.rtcp.ReceiverReport) null);
		}
	}
	public void test_javax_media_rtp_event_NewParticipantEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.NewParticipantEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.NewParticipantEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.NewParticipantEvent.class.getSuperclass().equals(javax.media.rtp.event.SessionEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.NewParticipantEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.NewParticipantEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.Participant.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.NewParticipantEvent o = null;
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.NewParticipantEvent o = null;
		new javax.media.rtp.event.NewParticipantEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.Participant) null);
		}
	}
	public void test_javax_media_UnsupportedPlugInException() throws Exception
	{
		assertEquals(javax.media.UnsupportedPlugInException.class.getModifiers(), 1);
		assertTrue(!javax.media.UnsupportedPlugInException.class.isInterface());
		assertTrue(javax.media.UnsupportedPlugInException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.UnsupportedPlugInException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.UnsupportedPlugInException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.UnsupportedPlugInException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.UnsupportedPlugInException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.UnsupportedPlugInException o = null;
		new javax.media.UnsupportedPlugInException();
		new javax.media.UnsupportedPlugInException((java.lang.String) null);
		}
	}
	public void test_javax_media_IncompatibleSourceException() throws Exception
	{
		assertEquals(javax.media.IncompatibleSourceException.class.getModifiers(), 1);
		assertTrue(!javax.media.IncompatibleSourceException.class.isInterface());
		assertTrue(javax.media.IncompatibleSourceException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.IncompatibleSourceException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.IncompatibleSourceException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.IncompatibleSourceException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.IncompatibleSourceException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.IncompatibleSourceException o = null;
		new javax.media.IncompatibleSourceException();
		new javax.media.IncompatibleSourceException((java.lang.String) null);
		}
	}
	public void test_javax_media_rtp_event_LocalPayloadChangeEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.LocalPayloadChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.LocalPayloadChangeEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.LocalPayloadChangeEvent.class.getSuperclass().equals(javax.media.rtp.event.SendStreamEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getNewPayload", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getSendStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SendStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.LocalPayloadChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.LocalPayloadChangeEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.SendStream.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.LocalPayloadChangeEvent o = null;
		o.getNewPayload();
		o.getParticipant();
		o.getSendStream();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.LocalPayloadChangeEvent o = null;
		new javax.media.rtp.event.LocalPayloadChangeEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.SendStream) null, 0, 0);
		}
	}
	public void test_javax_media_ClockStoppedException() throws Exception
	{
		assertEquals(javax.media.ClockStoppedException.class.getModifiers(), 1);
		assertTrue(!javax.media.ClockStoppedException.class.isInterface());
		assertTrue(javax.media.ClockStoppedException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ClockStoppedException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ClockStoppedException.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.ClockStoppedException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ClockStoppedException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ClockStoppedException o = null;
		new javax.media.ClockStoppedException();
		new javax.media.ClockStoppedException((java.lang.String) null);
		}
	}
	public void test_javax_media_MediaTimeSetEvent() throws Exception
	{
		assertEquals(javax.media.MediaTimeSetEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.MediaTimeSetEvent.class.isInterface());
		assertTrue(javax.media.MediaTimeSetEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.MediaTimeSetEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.MediaTimeSetEvent.class.getConstructor(new Class[]{javax.media.Controller.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.MediaTimeSetEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.MediaTimeSetEvent o = null;
		new javax.media.MediaTimeSetEvent((javax.media.Controller) null, (javax.media.Time) null);
		}
	}
	public void test_javax_media_RateChangeEvent() throws Exception
	{
		assertEquals(javax.media.RateChangeEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.RateChangeEvent.class.isInterface());
		assertTrue(javax.media.RateChangeEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("getRate", new Class[]{});
			assertEquals(m.getReturnType(), float.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.RateChangeEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.RateChangeEvent.class.getConstructor(new Class[]{javax.media.Controller.class, float.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.RateChangeEvent o = null;
		o.toString();
		o.getRate();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.RateChangeEvent o = null;
		new javax.media.RateChangeEvent((javax.media.Controller) null, 0.f);
		}
	}
	public void test_javax_media_rtp_event_RemoteEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.RemoteEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.RemoteEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.RemoteEvent.class.getSuperclass().equals(javax.media.rtp.event.RTPEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.RemoteEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.RemoteEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.RemoteEvent o = null;
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.RemoteEvent o = null;
		new javax.media.rtp.event.RemoteEvent((javax.media.rtp.SessionManager) null);
		}
	}
	public void test_javax_media_util_ImageToBuffer() throws Exception
	{
		assertEquals(javax.media.util.ImageToBuffer.class.getModifiers(), 1);
		assertTrue(!javax.media.util.ImageToBuffer.class.isInterface());
//		assertTrue(javax.media.util.ImageToBuffer.class.getSuperclass().equals(java.lang.Object.class)); // no longer true, we subclass FMJ's in FMJ.
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("createBuffer", new Class[]{java.awt.Image.class, float.class});
			assertEquals(m.getReturnType(), javax.media.Buffer.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.util.ImageToBuffer.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.util.ImageToBuffer.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.util.ImageToBuffer o = null;
		javax.media.util.ImageToBuffer.createBuffer((java.awt.Image) null, 0.f);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.util.ImageToBuffer o = null;
		new javax.media.util.ImageToBuffer();
		}
	}
	public void test_javax_media_ResourceUnavailableException() throws Exception
	{
		assertEquals(javax.media.ResourceUnavailableException.class.getModifiers(), 1);
		assertTrue(!javax.media.ResourceUnavailableException.class.isInterface());
		assertTrue(javax.media.ResourceUnavailableException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.ResourceUnavailableException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.ResourceUnavailableException.class.getConstructor(new Class[]{java.lang.String.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.ResourceUnavailableException o = null;
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.ResourceUnavailableException o = null;
		new javax.media.ResourceUnavailableException((java.lang.String) null);
		}
	}
	public void test_javax_media_format_UnsupportedFormatException() throws Exception
	{
		assertEquals(javax.media.format.UnsupportedFormatException.class.getModifiers(), 1);
		assertTrue(!javax.media.format.UnsupportedFormatException.class.isInterface());
		assertTrue(javax.media.format.UnsupportedFormatException.class.getSuperclass().equals(javax.media.MediaException.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getFailedFormat", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Format.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("printStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("printStackTrace", new Class[]{java.io.PrintStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("printStackTrace", new Class[]{java.io.PrintWriter.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("fillInStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 289);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getCause", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getLocalizedMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getMessage", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getStackTrace", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.StackTraceElement[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("initCause", new Class[]{java.lang.Throwable.class});
			assertEquals(m.getReturnType(), java.lang.Throwable.class);
			assertEquals(m.getModifiers(), 33);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("setStackTrace", new Class[]{java.lang.StackTraceElement[].class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.format.UnsupportedFormatException.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.format.UnsupportedFormatException.class.getConstructor(new Class[]{javax.media.Format.class});
			assertEquals(c.getModifiers(), 1);
		}
		{
			final Constructor c = javax.media.format.UnsupportedFormatException.class.getConstructor(new Class[]{java.lang.String.class, javax.media.Format.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.format.UnsupportedFormatException o = null;
		o.getFailedFormat();
		o.printStackTrace();
		o.printStackTrace((java.io.PrintStream) null);
		o.printStackTrace((java.io.PrintWriter) null);
		o.fillInStackTrace();
		o.toString();
		o.getCause();
		o.getLocalizedMessage();
		o.getMessage();
		o.getStackTrace();
		o.initCause((java.lang.Throwable) null);
		o.setStackTrace((java.lang.StackTraceElement[]) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.format.UnsupportedFormatException o = null;
		new javax.media.format.UnsupportedFormatException((javax.media.Format) null);
		new javax.media.format.UnsupportedFormatException((java.lang.String) null, (javax.media.Format) null);
		}
	}
	public void test_javax_media_EndOfMediaEvent() throws Exception
	{
		assertEquals(javax.media.EndOfMediaEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.EndOfMediaEvent.class.isInterface());
		assertTrue(javax.media.EndOfMediaEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.EndOfMediaEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.EndOfMediaEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.EndOfMediaEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.EndOfMediaEvent o = null;
		new javax.media.EndOfMediaEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_rtp_RTPSocket() throws Exception
	{
		assertEquals(javax.media.rtp.RTPSocket.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.RTPSocket.class.isInterface());
		assertTrue(javax.media.rtp.DataChannel.class.isAssignableFrom(javax.media.rtp.RTPSocket.class));
		assertTrue(javax.media.rtp.RTPSocket.class.getSuperclass().equals(javax.media.rtp.RTPPushDataSource.class));
		// Static fields: 
		// TODO: test DURATION_UNBOUNDED of type javax.media.Time
		// TODO: test DURATION_UNKNOWN of type javax.media.Time

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("start", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("stop", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("connect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("setContentType", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("disconnect", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getControlChannel", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.RTPPushDataSource.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getInputStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.OutputDataStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getContentType", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getOutputStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushSourceStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getDuration", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getStreams", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.PushSourceStream[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("setChild", new Class[]{javax.media.protocol.DataSource.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("setOutputStream", new Class[]{javax.media.protocol.PushSourceStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("setInputStream", new Class[]{javax.media.rtp.OutputDataStream.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("isStarted", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getLocator", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.MediaLocator.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("setLocator", new Class[]{javax.media.MediaLocator.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.RTPSocket.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.RTPSocket.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.RTPSocket o = null;
		o.start();
		o.stop();
		o.connect();
		o.setContentType((java.lang.String) null);
		o.disconnect();
		o.getControlChannel();
		o.getInputStream();
		o.getContentType();
		o.getOutputStream();
		o.getDuration();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.getStreams();
		o.setChild((javax.media.protocol.DataSource) null);
		o.setOutputStream((javax.media.protocol.PushSourceStream) null);
		o.setInputStream((javax.media.rtp.OutputDataStream) null);
		o.isStarted();
		o.getLocator();
		o.setLocator((javax.media.MediaLocator) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.RTPSocket o = null;
		new javax.media.rtp.RTPSocket();
		}
	}
	public void test_javax_media_rtp_event_ReceiveStreamEvent() throws Exception
	{
		assertEquals(javax.media.rtp.event.ReceiveStreamEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.rtp.event.ReceiveStreamEvent.class.isInterface());
		assertTrue(javax.media.rtp.event.ReceiveStreamEvent.class.getSuperclass().equals(javax.media.rtp.event.RTPEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("getReceiveStream", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.ReceiveStream.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("getParticipant", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.Participant.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("getSessionManager", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.rtp.SessionManager.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.rtp.event.ReceiveStreamEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.rtp.event.ReceiveStreamEvent.class.getConstructor(new Class[]{javax.media.rtp.SessionManager.class, javax.media.rtp.ReceiveStream.class, javax.media.rtp.Participant.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.rtp.event.ReceiveStreamEvent o = null;
		o.getReceiveStream();
		o.getParticipant();
		o.toString();
		o.getSource();
		o.getSessionManager();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.rtp.event.ReceiveStreamEvent o = null;
		new javax.media.rtp.event.ReceiveStreamEvent((javax.media.rtp.SessionManager) null, (javax.media.rtp.ReceiveStream) null, (javax.media.rtp.Participant) null);
		}
	}
	public void test_javax_media_protocol_InputSourceStream() throws Exception
	{
		assertEquals(javax.media.protocol.InputSourceStream.class.getModifiers(), 1);
		assertTrue(!javax.media.protocol.InputSourceStream.class.isInterface());
		assertTrue(javax.media.protocol.PullSourceStream.class.isAssignableFrom(javax.media.protocol.InputSourceStream.class));
		assertTrue(javax.media.protocol.InputSourceStream.class.getSuperclass().equals(java.lang.Object.class));
		// Static fields: 
		assertTrue(javax.media.protocol.InputSourceStream.LENGTH_UNKNOWN == -1L);

		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("read", new Class[]{byte[].class, int.class, int.class});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("close", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("getContentLength", new Class[]{});
			assertEquals(m.getReturnType(), long.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("getControls", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object[].class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("getControl", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("getContentDescriptor", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.protocol.ContentDescriptor.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("willReadBlock", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("endOfStream", new Class[]{});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.protocol.InputSourceStream.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.protocol.InputSourceStream.class.getConstructor(new Class[]{java.io.InputStream.class, javax.media.protocol.ContentDescriptor.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Fields (reflection): 
		if (true) {
		}

		// Methods (compilation): 
		if (false) {
		javax.media.protocol.InputSourceStream o = null;
		o.read((byte[]) null, 0, 0);
		o.close();
		o.getContentLength();
		o.getControls();
		o.getControl((java.lang.String) null);
		o.getContentDescriptor();
		o.willReadBlock();
		o.endOfStream();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.protocol.InputSourceStream o = null;
		new javax.media.protocol.InputSourceStream((java.io.InputStream) null, (javax.media.protocol.ContentDescriptor) null);
		}
	}
	public void test_javax_media_TransitionEvent() throws Exception
	{
		assertEquals(javax.media.TransitionEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.TransitionEvent.class.isInterface());
		assertTrue(javax.media.TransitionEvent.class.getSuperclass().equals(javax.media.ControllerEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.TransitionEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.TransitionEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.TransitionEvent o = null;
		o.toString();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.TransitionEvent o = null;
		new javax.media.TransitionEvent((javax.media.Controller) null, 0, 0, 0);
		}
	}
	public void test_javax_media_bean_playerbean_MediaPlayerInfoResBundle_en_US() throws Exception
	{
		assertEquals(javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getModifiers(), 1);
		assertTrue(!javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.isInterface());
		assertTrue(javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getSuperclass().equals(java.util.ListResourceBundle.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getKeys", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Enumeration.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("handleGetObject", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getObject", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getString", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getLocale", new Class[]{});
			assertEquals(m.getReturnType(), java.util.Locale.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getBundle", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.util.ResourceBundle.class);
			assertEquals(m.getModifiers(), 25);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getBundle", new Class[]{java.lang.String.class, java.util.Locale.class});
			assertEquals(m.getReturnType(), java.util.ResourceBundle.class);
			assertEquals(m.getModifiers(), 25);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getBundle", new Class[]{java.lang.String.class, java.util.Locale.class, java.lang.ClassLoader.class});
			assertEquals(m.getReturnType(), java.util.ResourceBundle.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getStringArray", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), java.lang.String[].class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US o = null;
		o.getKeys();
		o.handleGetObject((java.lang.String) null);
		o.getObject((java.lang.String) null);
		o.getString((java.lang.String) null);
		o.getLocale();
		javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.getBundle((java.lang.String) null);
		javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.getBundle((java.lang.String) null, (java.util.Locale) null);
		javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US.getBundle((java.lang.String) null, (java.util.Locale) null, (java.lang.ClassLoader) null);
		o.getStringArray((java.lang.String) null);
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US o = null;
		new javax.media.bean.playerbean.MediaPlayerInfoResBundle_en_US();
		}
	}
	public void test_javax_media_StopByRequestEvent() throws Exception
	{
		assertEquals(javax.media.StopByRequestEvent.class.getModifiers(), 1);
		assertTrue(!javax.media.StopByRequestEvent.class.isInterface());
		assertTrue(javax.media.StopByRequestEvent.class.getSuperclass().equals(javax.media.StopEvent.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getMediaTime", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Time.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getTargetState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getPreviousState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getCurrentState", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getSource", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Object.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getSourceController", new Class[]{});
			assertEquals(m.getReturnType(), javax.media.Controller.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.StopByRequestEvent.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.StopByRequestEvent.class.getConstructor(new Class[]{javax.media.Controller.class, int.class, int.class, int.class, javax.media.Time.class});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.StopByRequestEvent o = null;
		o.toString();
		o.getMediaTime();
		o.getTargetState();
		o.getPreviousState();
		o.getCurrentState();
		o.getSource();
		o.getSourceController();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.StopByRequestEvent o = null;
		new javax.media.StopByRequestEvent((javax.media.Controller) null, 0, 0, 0, (javax.media.Time) null);
		}
	}
	public void test_javax_media_CaptureDeviceManager() throws Exception
	{
		assertEquals(javax.media.CaptureDeviceManager.class.getModifiers(), 1);
		assertTrue(!javax.media.CaptureDeviceManager.class.isInterface());
		assertTrue(javax.media.CaptureDeviceManager.class.getSuperclass().equals(java.lang.Object.class));
		// Methods (reflection): 
		if (true) {
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("getDevice", new Class[]{java.lang.String.class});
			assertEquals(m.getReturnType(), javax.media.CaptureDeviceInfo.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("getDeviceList", new Class[]{javax.media.Format.class});
			assertEquals(m.getReturnType(), java.util.Vector.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("addDevice", new Class[]{javax.media.CaptureDeviceInfo.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("removeDevice", new Class[]{javax.media.CaptureDeviceInfo.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("commit", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 9);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("hashCode", new Class[]{});
			assertEquals(m.getReturnType(), int.class);
			assertEquals(m.getModifiers(), 257);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("getClass", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.Class.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("wait", new Class[]{long.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("wait", new Class[]{long.class, int.class});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("wait", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 17);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("equals", new Class[]{java.lang.Object.class});
			assertEquals(m.getReturnType(), boolean.class);
			assertEquals(m.getModifiers(), 1);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("notify", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("notifyAll", new Class[]{});
			assertEquals(m.getReturnType(), void.class);
			assertEquals(m.getModifiers(), 273);
		}
		{
			final Method m = javax.media.CaptureDeviceManager.class.getMethod("toString", new Class[]{});
			assertEquals(m.getReturnType(), java.lang.String.class);
			assertEquals(m.getModifiers(), 1);
		}
		}

		// Constructors (reflection): 
		if (true) {
		{
			final Constructor c = javax.media.CaptureDeviceManager.class.getConstructor(new Class[]{});
			assertEquals(c.getModifiers(), 1);
		}
		}

		// Methods (compilation): 
		if (false) {
		javax.media.CaptureDeviceManager o = null;
		javax.media.CaptureDeviceManager.getDevice((java.lang.String) null);
		javax.media.CaptureDeviceManager.getDeviceList((javax.media.Format) null);
		javax.media.CaptureDeviceManager.addDevice((javax.media.CaptureDeviceInfo) null);
		javax.media.CaptureDeviceManager.removeDevice((javax.media.CaptureDeviceInfo) null);
		javax.media.CaptureDeviceManager.commit();
		o.hashCode();
		o.getClass();
		o.wait(0L);
		o.wait(0L, 0);
		o.wait();
		o.equals((java.lang.Object) null);
		o.notify();
		o.notifyAll();
		o.toString();
		}
		// Constructors (compilation): 
		if (false) {
		javax.media.CaptureDeviceManager o = null;
		new javax.media.CaptureDeviceManager();
		}
	}




}
