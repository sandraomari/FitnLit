package com.example.android.gym;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/*public class InstructorAdapter extends RecyclerView.Adapter<InstructorAdapter.InstructorHolder>{
    private List<Instructor> instructorList;

    /*public class InstructorHolder extends RecyclerView.ViewHolder{
        public TextView name, contact, email, gender;
        public InstructorHolder(View view){
            super(view);
            name =  view.findViewById(R.id.instructor_name);
            contact = view.findViewById(R.id.instructor_contact);
            email = view.findViewById(R.id.instructor_email);
            gender =  view.findViewById(R.id.instructor_gender);
        }
    }

    public InstructorAdapter(List<Instructor> instructorList)
    {
        this.instructorList = instructorList;
    }

    @Override
    public InstructorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_instructors, parent, false);

        return new InstructorHolder(itemView);
    }

    @Override
    public void onBindViewHolder(InstructorHolder holder, int position)
    {
        Instructors instructor = instructorList.get(position);
        holder.name.setText(instructor.getName());
        holder.contact.setText(instructor.getContact());
        holder.email.setText(instructor.getEmail());
        holder.gender.setText(instructor.getGender());
    }

    @Override
    public int getItemCount() {
        return instructorList.size();
    }
        }
        */


