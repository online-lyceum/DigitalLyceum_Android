// Generated by view binder compiler. Do not edit!
package com.example.lyceumapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.lyceumapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChooseSchoolsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNext;

  @NonNull
  public final RecyclerView recyclerChooseSchool;

  private ActivityChooseSchoolsBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNext,
      @NonNull RecyclerView recyclerChooseSchool) {
    this.rootView = rootView;
    this.buttonNext = buttonNext;
    this.recyclerChooseSchool = recyclerChooseSchool;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChooseSchoolsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChooseSchoolsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_choose_schools, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChooseSchoolsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNext;
      Button buttonNext = ViewBindings.findChildViewById(rootView, id);
      if (buttonNext == null) {
        break missingId;
      }

      id = R.id.recyclerChooseSchool;
      RecyclerView recyclerChooseSchool = ViewBindings.findChildViewById(rootView, id);
      if (recyclerChooseSchool == null) {
        break missingId;
      }

      return new ActivityChooseSchoolsBinding((LinearLayout) rootView, buttonNext,
          recyclerChooseSchool);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}