public void CompleteTask(int taskId) {
    // Assuming there's a TaskManager class that handles task statuses
    TaskManager taskManager = new TaskManager();
    
    // Update the task's status to 'complete'
    taskManager.updateTaskStatus(taskId, "complete");
    
    // You can add more logic here if needed
}
