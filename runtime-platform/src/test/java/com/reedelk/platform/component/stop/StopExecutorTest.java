package com.reedelk.platform.component.stop;

import com.reedelk.platform.execution.AbstractExecutionTest;
import com.reedelk.platform.execution.MessageAndContext;
import com.reedelk.platform.graph.ExecutionGraph;
import com.reedelk.platform.graph.ExecutionNode;
import com.reedelk.runtime.component.Stop;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import static org.assertj.core.api.Assertions.assertThat;

class StopExecutorTest extends AbstractExecutionTest {

    private StopExecutor executor = new StopExecutor();

    @Test
    void shouldReturnOriginalPublisher() {
        // Given
        ExecutionGraph graph = ExecutionGraph.build();
        ExecutionNode stop = newExecutionNode(new Stop());
        Publisher<MessageAndContext> publisher = Mono.empty();

        // When
        Publisher<MessageAndContext> endPublisher = executor.execute(publisher, stop, graph);

        // Then
        assertThat(publisher).isEqualTo(endPublisher);
    }
}
