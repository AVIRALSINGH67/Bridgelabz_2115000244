class TextState {
    String content;
    TextState next, prev;

    TextState(String content) {
        this.content = content;
        this.next = this.prev = null;
    }
}

class TextEditor {
    private TextState head = null, tail = null, current = null;
    private final int MAX_HISTORY = 10;
    private int size = 0;

    void addTextState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        if (head == null) head = newState;
        tail = newState;
        size++;

        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No text available.");
        }
    }
}

public class TextEditorManager {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addTextState("Hello");
        editor.addTextState("Hello, World!");
        editor.addTextState("Hello, World! This is a test.");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
