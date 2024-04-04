/**********************************************************************
*
*Stack = LIFO data structure. Last-In-First-Out
*stores objects into a sort of vertical tower
*push() to add to the top
*pop() to remove from the top
*peek() to identify the last in
*search() to search the stack(Last is 1)
*empty() checks if stack is empty then returns a boolean value

*Uses for stacks?
*1.undo/redo features in text editors
*2.moving backward/forward through browser history (< >)
*3.backtracking algorithms (Navigate maze, file directories)
*4.calling functions (call stack)
***************************************************************************
*/

package DataStructuresAndAlgorithms.Stacks;
import java.util.Stack;
public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");

        String myFaveGame = stack.pop();
        System.out.println(myFaveGame);

    for(int i = 0; i<10; i++) {
        stack.push("DOOM");
    }

        System.out.println(stack);
        }
    }

