package com.github.nalukit.nalu.processor.shell.shellWithComposite02;

import com.github.nalukit.nalu.client.IsRouter;
import com.github.nalukit.nalu.client.exception.RoutingInterceptionException;
import com.github.nalukit.nalu.client.internal.AbstractShellCreator;
import com.github.nalukit.nalu.client.internal.application.IsShellCreator;
import com.github.nalukit.nalu.client.internal.application.ShellInstance;
import com.github.nalukit.nalu.processor.common.MockContext;
import java.lang.Override;
import org.gwtproject.event.shared.SimpleEventBus;

/**
 * Build with Nalu version >>2.11.2<< at >>2022.10.11-12:34:18<<
 */
public final class ShellWithCompositeCreatorImpl extends AbstractShellCreator<MockContext> implements IsShellCreator {
  public ShellWithCompositeCreatorImpl(IsRouter router, MockContext context,
                                       SimpleEventBus eventBus) {
    super(router, context, eventBus);
  }

  @Override
  public ShellInstance create() {
    ShellInstance shellInstance = new ShellInstance();
    shellInstance.setShellClassName("com.github.nalukit.nalu.processor.shell.shellWithComposite02.ShellWithComposite");
    ShellWithComposite shell = new ShellWithComposite();
    shellInstance.setShell(shell);
    shell.setContext(context);
    shell.setEventBus(eventBus);
    shell.setRouter(router);
    return shellInstance;
  }

  @Override
  public void onFinishCreating() throws RoutingInterceptionException {
  }
}
