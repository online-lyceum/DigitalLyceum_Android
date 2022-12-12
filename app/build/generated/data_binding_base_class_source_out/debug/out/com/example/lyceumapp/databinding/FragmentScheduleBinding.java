// Generated by view binder compiler. Do not edit!
package com.example.lyceumapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.lyceumapp.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentScheduleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonChangeGrade;

  @NonNull
  public final LinearLayout linearScheduleHeader;

  @NonNull
  public final LinearLayout linearWeekType;

  @NonNull
  public final Spinner spinnerWeekType;

  @NonNull
  public final TabLayout tabLayoutSchedule;

  @NonNull
  public final TextView textScheduleForGrade;

  @NonNull
  public final TextView textWeekType;

  @NonNull
  public final ViewPager2 viewPagerSchedule;

  private FragmentScheduleBinding(@NonNull LinearLayout rootView, @NonNull Button buttonChangeGrade,
      @NonNull LinearLayout linearScheduleHeader, @NonNull LinearLayout linearWeekType,
      @NonNull Spinner spinnerWeekType, @NonNull TabLayout tabLayoutSchedule,
      @NonNull TextView textScheduleForGrade, @NonNull TextView textWeekType,
      @NonNull ViewPager2 viewPagerSchedule) {
    this.rootView = rootView;
    this.buttonChangeGrade = buttonChangeGrade;
    this.linearScheduleHeader = linearScheduleHeader;
    this.linearWeekType = linearWeekType;
    this.spinnerWeekType = spinnerWeekType;
    this.tabLayoutSchedule = tabLayoutSchedule;
    this.textScheduleForGrade = textScheduleForGrade;
    this.textWeekType = textWeekType;
    this.viewPagerSchedule = viewPagerSchedule;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentScheduleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_schedule, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentScheduleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonChangeGrade;
      Button buttonChangeGrade = ViewBindings.findChildViewById(rootView, id);
      if (buttonChangeGrade == null) {
        break missingId;
      }

      id = R.id.linearScheduleHeader;
      LinearLayout linearScheduleHeader = ViewBindings.findChildViewById(rootView, id);
      if (linearScheduleHeader == null) {
        break missingId;
      }

      id = R.id.linearWeekType;
      LinearLayout linearWeekType = ViewBindings.findChildViewById(rootView, id);
      if (linearWeekType == null) {
        break missingId;
      }

      id = R.id.spinnerWeekType;
      Spinner spinnerWeekType = ViewBindings.findChildViewById(rootView, id);
      if (spinnerWeekType == null) {
        break missingId;
      }

      id = R.id.tabLayoutSchedule;
      TabLayout tabLayoutSchedule = ViewBindings.findChildViewById(rootView, id);
      if (tabLayoutSchedule == null) {
        break missingId;
      }

      id = R.id.textScheduleForGrade;
      TextView textScheduleForGrade = ViewBindings.findChildViewById(rootView, id);
      if (textScheduleForGrade == null) {
        break missingId;
      }

      id = R.id.textWeekType;
      TextView textWeekType = ViewBindings.findChildViewById(rootView, id);
      if (textWeekType == null) {
        break missingId;
      }

      id = R.id.viewPagerSchedule;
      ViewPager2 viewPagerSchedule = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerSchedule == null) {
        break missingId;
      }

      return new FragmentScheduleBinding((LinearLayout) rootView, buttonChangeGrade,
          linearScheduleHeader, linearWeekType, spinnerWeekType, tabLayoutSchedule,
          textScheduleForGrade, textWeekType, viewPagerSchedule);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}