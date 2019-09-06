public class GroupController {
    
    private Group model;
    private GroupView view;
 
    public GroupController(Group model, GroupView view){
       this.model = model;
       this.view = view;
    }
 
    public void setGroupName(String name){
       model.setName(name);		
    }
 
    public String getGroupName(){
       return model.getName();		
    }
 
 }